SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "python3-opencv-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "eb884d025f1acf2b5c24d16c89554147db5af62bc1b0b205402d61bcfb446e2b6f2bddd636b5a2c2f748142298d130eef83553214685ca86e7f5caccbe386647"

RPROVIDES:${PN} += "python3-opencv \
python3-opencv-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-aruco.so.407 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-dnn.so.407 \
libopencv-face.so.407 \
libopencv-features2d.so.407 \
libopencv-flann.so.407 \
libopencv-gapi.so.407 \
libopencv-highgui.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-ml.so.407 \
libopencv-objdetect.so.407 \
libopencv-optflow.so.407 \
libopencv-photo.so.407 \
libopencv-plot.so.407 \
libopencv-shape.so.407 \
libopencv-stitching.so.407 \
libopencv-tracking.so.407 \
libopencv-video.so.407 \
libopencv-videoio.so.407 \
libopencv-ximgproc.so.407 \
libstdc++.so.6 \
python-abi"

inherit rpm
