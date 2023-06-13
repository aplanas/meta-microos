SUMMARY = "Development tools for the Parma Polyhedra Library C and C++ interfaces"
DESCRIPTION = "The header files, Autoconf macro, and ppl-config tool for developing \
applications using the Parma Polyhedra Library through its C and C++ \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-devel-1.2-3.1.aarch64.rpm"
RPM_HASH = "d1c8a1724cca1ac13aafdf200eaf82b3b3853dc52dc95ecc6f79741590a200541ed39e6345702093b54b17a2f436d7a098dadcbed6047ffa9ad09e0fb8b607b8"

RPROVIDES:${PN} += "ppl-devel \
ppl-devel(aarch-64)"

RDEPENDS:${PN} += "gmp-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libppl.so.14()(64bit) \
libppl14 \
libppl_c4 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
