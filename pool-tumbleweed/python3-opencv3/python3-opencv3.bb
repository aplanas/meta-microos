SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "python3-opencv3-3.4.19-1.3.aarch64.rpm"
RPM_HASH = "d07813886e31fe2221f8e6c21c1b8bc6e102a0cf68ec6ce4d1316bb56edb8fd47152402b6734d241d214b233d746c9ab089600e4154b5a4d2b8bf3be9649cca5"

RPROVIDES:${PN} += "python3-opencv-qt5 \
python3-opencv3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.3.4 \
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
libopencv-tracking.so.3.4 \
libopencv-video.so.3.4 \
libopencv-videoio.so.3.4 \
libstdc++.so.6 \
python-abi"

inherit rpm
