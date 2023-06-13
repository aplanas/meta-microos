SUMMARY = "Video stabilization libraries for OpenCV"
DESCRIPTION = "Video stabilization libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videostab407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "3c29a388ba0d2c32135cb4b86b550e32cd9b69cb07f61e0aecd23b6c1e6eb60d421d0653aee40e07a15783ece50cb63ebca65553e8681481d0cc1c4adf239d72"

RPROVIDES:${PN} += "libopencv_videostab.so.407()(64bit) \
libopencv_videostab407 \
libopencv_videostab407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_features2d.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_photo.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
