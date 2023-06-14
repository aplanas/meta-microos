SUMMARY = "Libraries to use OpenCV computer vision"
DESCRIPTION = "The Open Computer Vision Library is a collection of algorithms and sample code \
for various computer vision problems. The library is compatible with IPL and \
utilizes Intel Integrated Performance Primitives for better performance."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "libopencv3_4-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "6cb588215f4ffbd060a7f5f784e192cf8423b101c3c0908f8c5e62bd33f2da480764a5e6d881455731f077dd3f57a81998ab4d6e32ae606e282ae22d1d966267"

RPROVIDES:${PN} += "libopencv-calib3d.so.3.4 \
libopencv-core.so.3.4 \
libopencv-dnn.so.3.4 \
libopencv-face.so.3.4 \
libopencv-features2d.so.3.4 \
libopencv-flann.so.3.4 \
libopencv-highgui.so.3.4 \
libopencv-imgcodecs.so.3.4 \
libopencv-imgproc.so.3.4 \
libopencv-ml.so.3.4 \
libopencv-objdetect.so.3.4 \
libopencv-photo.so.3.4 \
libopencv-plot.so.3.4 \
libopencv-shape.so.3.4 \
libopencv-stitching.so.3.4 \
libopencv-superres.so.3.4 \
libopencv-tracking.so.3.4 \
libopencv-video.so.3.4 \
libopencv-videoio.so.3.4 \
libopencv-videostab.so.3.4 \
libopencv3-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenEXR-3-1.so.30 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libdc1394.so.25 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libopenblas.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libswscale.so.5.9 \
libtbb.so.12 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1"

inherit rpm
