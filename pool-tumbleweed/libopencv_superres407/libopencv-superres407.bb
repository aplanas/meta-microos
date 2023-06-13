SUMMARY = "Superresolution libraries for OpenCV"
DESCRIPTION = "Superresolution libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_superres407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "272554cbdec201bf5f3c0deb61c70ae541f0e805759a11f595fb474cb9975cde9fe100c9c3922882b694a380d45613cb71b245ab17be1d8a3cc1d80a5fb953ef"

RPROVIDES:${PN} += "libopencv_superres.so.407()(64bit) \
libopencv_superres407 \
libopencv_superres407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_optflow.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
