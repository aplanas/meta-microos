SUMMARY = "Transport and Economic Simulation Game"
DESCRIPTION = "Simutrans is a transport and economic simulation with some ecological \
aspects. The goal of the game is to build an infrastructure which \
allows you to transport goods between the various industries and towns, \
and to support the towns with water and energy. A second goal is to \
become as rich as possible, but you will have to reinvest a good part \
of your earned money to expand your infrastructure network."
LICENSE = "Artistic-1.0"

PV = "123.0.1"

RPM_NAME = "simutrans-123.0.1-1.9.aarch64.rpm"
RPM_HASH = "07d49359170d71f60e46edb011a458c10ccde9a7a220c3e726f488e6bc6c14085885802df89545d938471e5909190db81881ae5b25ab8b2e34ecd3eeb40c4822"

RPROVIDES:${PN} += "application() \
application(simutrans.desktop) \
simutrans \
simutrans(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
