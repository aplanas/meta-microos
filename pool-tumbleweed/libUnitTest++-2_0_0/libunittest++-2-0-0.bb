SUMMARY = "A unit testing framework for C++"
DESCRIPTION = "UnitTest++ is a unit testing framework for C++. It was designed \
to do test-driven development on a wide variety of platforms. \
UnitTest++ is mostly standard C++ and makes minimal use of \
advanced library and language features."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libUnitTest++-2_0_0-2.0.0-2.3.aarch64.rpm"
RPM_HASH = "052dca11623d5faf0e7889fd98423dfd088c31bec710870a7b9d406b6b5c25cf153f0285a103a09178492a64e71dc1307291f1cb983ebc4e327b4edbbc247758"

RPROVIDES:${PN} += "libUnitTest++-2.0.0.so()(64bit) \
libUnitTest++-2_0_0 \
libUnitTest++-2_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
