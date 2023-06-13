SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.7.0"

RPM_NAME = "opencv-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "79d4b06869062040fb768a6ec4d13d711c922891ad8b7f66ede235fc693f95b1b6fe0d6b315e94619f45a016465b5c89e8b54c97c42409485d47e45d826b12c1"

RPROVIDES:${PN} += "opencv \
opencv(aarch-64) \
opencv-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_dnn.so.407()(64bit) \
libopencv_features2d.so.407()(64bit) \
libopencv_highgui.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_objdetect.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
