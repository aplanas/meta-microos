SUMMARY = "Library for non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfityk4-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "26d0e4e37b2a23ac4a80d42b37400fe215616438b7397b59e8039abd83323a3c7d4edd34ab077ab46bcaaae85014eb7820a48f3b5963f33a5fbd8d8f5fc97aac"

RPROVIDES:${PN} += "libfityk.so.4()(64bit) \
libfityk4 \
libfityk4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnlopt.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxy.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
