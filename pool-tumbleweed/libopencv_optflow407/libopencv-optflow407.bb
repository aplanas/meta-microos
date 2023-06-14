SUMMARY = "Optical flow calculation libraries for OpenCV"
DESCRIPTION = "Optical flow calculation libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_optflow407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "5fedb5b4ede4978b6f7d45bb84e28ebbcddae647227f236fd2e26a8a900c394e6903fe3529ade085ed057342a72ea54b1cd8709426a109d66d7c09f732aeb1fe"

RPROVIDES:${PN} += "libopencv-optflow.so.407 \
libopencv-optflow407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-flann.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-video.so.407 \
libopencv-ximgproc.so.407 \
libstdc++.so.6"

inherit rpm
