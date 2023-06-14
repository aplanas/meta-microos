SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "python3-opencv-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "b1d01f4616da652588cfb70be6664b4b44acf392fabc49a7d5751c6d51f41415566d13d34ee942aee82c0fbd004adcdb0ea1eff13718a2c69305965dd5b168c7"

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
