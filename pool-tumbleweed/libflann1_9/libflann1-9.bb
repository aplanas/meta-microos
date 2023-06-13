SUMMARY = "Fast Library for Approximate Nearest Neighbors"
DESCRIPTION = "FLANN is a library for performing approximate nearest neighbor \
searches in high dimensional spaces. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libflann1_9-1.9.2-3.3.aarch64.rpm"
RPM_HASH = "ce226cea762414419ec1301cbec6d4ffe6194c27d27c1e0367aa6448cfae85f837bcaf3d57926b47432b3484e0e5a8b9d5a1307542b8937b96b124c750c45da9"

RPROVIDES:${PN} += "libflann.so.1.9()(64bit) \
libflann1_9 \
libflann1_9(aarch-64) \
libflann_cpp.so.1.9()(64bit) \
libflann_cpp1_9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
