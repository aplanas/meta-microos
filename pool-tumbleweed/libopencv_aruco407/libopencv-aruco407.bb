SUMMARY = "Pattern grid detection libraries for OpenCV"
DESCRIPTION = "Pattern grid detectiion libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_aruco407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "8ec7a9547d76463fe9a80c8a143430c1fd736cd2dc4a84be5fca7d0ad3b50d4e30b3d976358ea0109a0c8ea6ed9209e877f387e165cf8ba4e273766251811234"

RPROVIDES:${PN} += "libopencv_aruco.so.407()(64bit) \
libopencv_aruco407 \
libopencv_aruco407(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_objdetect.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
