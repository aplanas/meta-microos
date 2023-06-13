SUMMARY = "Optical flow calculation libraries for OpenCV"
DESCRIPTION = "Optical flow calculation libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_optflow407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "5fedb5b4ede4978b6f7d45bb84e28ebbcddae647227f236fd2e26a8a900c394e6903fe3529ade085ed057342a72ea54b1cd8709426a109d66d7c09f732aeb1fe"

RPROVIDES:${PN} += "libopencv_optflow.so.407()(64bit) \
libopencv_optflow407 \
libopencv_optflow407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_flann.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libopencv_ximgproc.so.407()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
