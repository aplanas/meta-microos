SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "python3-opencv-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "b1d01f4616da652588cfb70be6664b4b44acf392fabc49a7d5751c6d51f41415566d13d34ee942aee82c0fbd004adcdb0ea1eff13718a2c69305965dd5b168c7"

RPROVIDES:${PN} += "python3-opencv \
python3-opencv(aarch-64) \
python3-opencv-qt5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopencv_aruco.so.407()(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_dnn.so.407()(64bit) \
libopencv_face.so.407()(64bit) \
libopencv_features2d.so.407()(64bit) \
libopencv_flann.so.407()(64bit) \
libopencv_gapi.so.407()(64bit) \
libopencv_highgui.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_ml.so.407()(64bit) \
libopencv_objdetect.so.407()(64bit) \
libopencv_optflow.so.407()(64bit) \
libopencv_photo.so.407()(64bit) \
libopencv_plot.so.407()(64bit) \
libopencv_shape.so.407()(64bit) \
libopencv_stitching.so.407()(64bit) \
libopencv_tracking.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libopencv_ximgproc.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
