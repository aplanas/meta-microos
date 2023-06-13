SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.6"

RPM_NAME = "barvinok-0.41.6-1.4.aarch64.rpm"
RPM_HASH = "5cffc31e58c7b300e7a72ac1408f786dbd01c3cd35baa8fed0b5021ac4f0dc165686d0c837f5e465d7c9d103fc4e8aeda52c5b30d8192159d00c27c3bca4a6e7"

RPROVIDES:${PN} += "barvinok \
barvinok(aarch-64) \
bundled(4ti2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbarvinok.so.23()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libntl.so.44()(64bit) \
libpolylibgmp.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
