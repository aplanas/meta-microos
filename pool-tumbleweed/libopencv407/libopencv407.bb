SUMMARY = "Libraries to use OpenCV computer vision"
DESCRIPTION = "The Open Computer Vision Library is a collection of algorithms and sample code \
for various computer vision problems. The library is compatible with IPL and \
utilizes Intel Integrated Performance Primitives for better performance."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "91009ea92b200dd485eff3c1d5dabe925dbd27c3eb6777045b0ebda678b793246a9c83cd407aa23adc5dff57a25aacef032fde22b942bb53f212deb52547ddf7"

RPROVIDES:${PN} += "libopencv407 \
libopencv407(aarch-64) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_dnn.so.407()(64bit) \
libopencv_features2d.so.407()(64bit) \
libopencv_flann.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_ml.so.407()(64bit) \
libopencv_photo.so.407()(64bit) \
libopencv_plot.so.407()(64bit) \
libopencv_shape.so.407()(64bit) \
libopencv_stitching.so.407()(64bit) \
libopencv_tracking.so.407()(64bit) \
libopencv_video.so.407()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGLX.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit) \
libz.so.1()(64bit)"

inherit rpm
