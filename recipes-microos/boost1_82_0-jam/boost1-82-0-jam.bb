SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-jam-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "adf703c9fbbd5c2a4ca368fefd4520e2595232cf9a824d567d82501e41c83163a25f22eba5e9170531b9914a1093df61e713ada9dbf9770892c6f31400c54b81"

RPROVIDES:${PN} += "boost-jam-impl boost1_82_0-jam boost1_82_0-jam(aarch-64) boost_1_66-jam"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
