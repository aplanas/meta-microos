SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "python3-opencv3-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "11c329df6560ddf43c36caab4a3505471774f6f4333473750d469a6f5937ceb9b379cb967cae79b008eba9cb690d858a7fa932bbed45f31576c0c2bf826d09a8"

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
