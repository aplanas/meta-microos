SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.6"

RPM_NAME = "libbarvinok23-0.41.6-1.4.aarch64.rpm"
RPM_HASH = "608a968e510ce62c6ab7071c65234e40c2c3035528a8650d5c8d5901c51d38d886fb1bdc09951a612bf33f6097631bb1c8d31c003ef79299025d26c59e4c04c8"

RPROVIDES:${PN} += "libbarvinok.so.23()(64bit) \
libbarvinok23 \
libbarvinok23(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglpk.so.40()(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libntl.so.44()(64bit) \
libpolylibgmp.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
