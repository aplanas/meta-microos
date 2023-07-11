SUMMARY = "Libraries to use OpenCV computer vision"
DESCRIPTION = "The Open Computer Vision Library is a collection of algorithms and sample code \
for various computer vision problems. The library is compatible with IPL and \
utilizes Intel Integrated Performance Primitives for better performance."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "12ff25e42a50b0abc9b312e332e91078d8980810b8989091376d3fc260393920fc6a476fcb1fa20e9003d809efb8e71eb23dcaf239c9ad666628559f6ed57e6f"

RPROVIDES:${PN} += "libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-dnn.so.407 \
libopencv-features2d.so.407 \
libopencv-flann.so.407 \
libopencv-imgproc.so.407 \
libopencv-ml.so.407 \
libopencv-photo.so.407 \
libopencv-plot.so.407 \
libopencv-shape.so.407 \
libopencv-stitching.so.407 \
libopencv-tracking.so.407 \
libopencv-video.so.407 \
libopencv407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
