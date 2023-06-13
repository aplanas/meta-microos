SUMMARY = "Libraries to use OpenCV computer vision"
DESCRIPTION = "The Open Computer Vision Library is a collection of algorithms and sample code \
for various computer vision problems. The library is compatible with IPL and \
utilizes Intel Integrated Performance Primitives for better performance."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "libopencv3_4-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "6cb588215f4ffbd060a7f5f784e192cf8423b101c3c0908f8c5e62bd33f2da480764a5e6d881455731f077dd3f57a81998ab4d6e32ae606e282ae22d1d966267"

RPROVIDES:${PN} += "libopencv3_4 \
libopencv3_4(aarch-64) \
libopencv_calib3d.so.3.4()(64bit) \
libopencv_core.so.3.4()(64bit) \
libopencv_dnn.so.3.4()(64bit) \
libopencv_face.so.3.4()(64bit) \
libopencv_features2d.so.3.4()(64bit) \
libopencv_flann.so.3.4()(64bit) \
libopencv_highgui.so.3.4()(64bit) \
libopencv_imgcodecs.so.3.4()(64bit) \
libopencv_imgproc.so.3.4()(64bit) \
libopencv_ml.so.3.4()(64bit) \
libopencv_objdetect.so.3.4()(64bit) \
libopencv_photo.so.3.4()(64bit) \
libopencv_plot.so.3.4()(64bit) \
libopencv_shape.so.3.4()(64bit) \
libopencv_stitching.so.3.4()(64bit) \
libopencv_superres.so.3.4()(64bit) \
libopencv_tracking.so.3.4()(64bit) \
libopencv_video.so.3.4()(64bit) \
libopencv_videoio.so.3.4()(64bit) \
libopencv_videostab.so.3.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libdc1394.so.25()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstriff-1.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libtbb.so.12()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit)"

inherit rpm
