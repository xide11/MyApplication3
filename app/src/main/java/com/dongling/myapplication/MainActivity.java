package com.dongling.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//http://www.cnblogs.com/deman/p/5860976.html
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        // 1.如何对Android应用进行性能分析
//
//首先从函数的耗时来说，有一个工具TraceView 这是Android SDK自带的工作，用于测量函数耗时的。
//UI布局的分析，可以有2块，一块是Hierarchy Viewer 可以看到View的布局层次，以及每个View刷新加载
//时间。这样可以很快定位到那块layout & View耗时最长。
//还有就是通过自定义View 来减少view 的层次。
//
//// 2.什么情况下会导致内存泄漏
//内存泄漏是个折腾的问题。
//什么时候会发生内存泄漏？内存泄漏的根本原因：长生命周期的对象持有短生命周期的对象。短周期对象就无法
//及时释放。
//
//2.1.静态集合类引起内存泄漏
//主要是 hashmap,Vector 等，如果是静态集合，这些集合没有及时set null的话，就会一直持有这些对象。
//
//2.2.remove 方法无法删除set 集， Objects.hash(firstName,lastName);
//经过测试，hashcode修改后，就没有方法remove了。
//
//2.3.observer 我们在使用监听器的时候，往往是addxxxlistener,但是当我们不需要的时候，忘记romovexxxlistener,就容易内存leak.
//广播没有unregisterrecevier
//
//2.4.各种数据连接没有关闭，contentprovider , io ,sokect等，cursor
//
//2.5.内部类：
//java 中 的内部类（匿名内部类），会持有宿主类的强引用this.
//所以如果是new Thread这种，后台线程的操作，当线程没有执行结束时，activity不会被回收。
//Context的引用，当TextView 等等都会持有上下文的引用。如果有static drawable，就会导致该内存
//无法释放。
//
//2.6.单例
//单例 是一个全局的静态对象，当持有某个复制的类A是，A无法被释放，内存leak;
//
//
// // 3.如何避免OOM 异常
//        首先OOM是什么？
//当程序需要申请一段“大”内存，但是虚拟机没有方法及时的给到，即使做了GC操作以后
//这就会抛出OutOfMemoryException 也就是OOM
//
//Android 的OOM 怎么样？
//为了减少单个APP 对整个系统的影响，Android 为每个app 设置了一个内存上限
//       public void getMemoryLimited(Activity context){
//           ActivityManager activityManager=(ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
//            System.out.println(activityManager.getMemoryClass());
//            System.out.println(activityManager.getLargeMemoryClass());
//            System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));
//
//        }
//
//        HTC M7实测，192M上限。512M 一般情况下，192M就是上限，但是由于某些特殊情况，android允许使用一个更大的RAM。
//
//如何避免OOM
//减少内存对象的占用
//3.1.ArrayMap/SparseArray 代替hashmap
//
//3.2.避免在Android 里面使用Enum
//
//III.减少bitmap的内存占用
//   1.inSampleSize: 缩放比例，在把图片载入内存之前，我们就需要先计算出一个合适的缩放比例，避免不必要的大图载入。
//   2.decode format: 解码格式，选择ARGB_8888/RBG_565/ARGB_4444/ALPHA_8,存在很大差异。
//
//IV.，减少资源图片的大小，过大的图片可以考虑分段加载
//  内存对象的重复利用
//
//  大多数对象的复用，都是利用对象池的技术
//  I listview/ gridview/recycleview contentview的复用
//  II.inBitmap 属性对于内存对象的复用ARGB_8888/RBG_565/ARGB_4444/ALPHA_8
//
//这个方法在某些条件下非常有用，比如要加载上千张图片的时候。
//
//   III.避免在ondraw 方法里面new 对象
//        IV.StringBuilder 代替+
//
//        4. Android中如何捕获的异常

    }

}











