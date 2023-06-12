SUMMARY = "The Boost::Chrono runtime library"
DESCRIPTION = "This package contains the Boost::Chrono runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_chrono1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "bdc34904eefe23b2017042b5f421e3e946537c69dd3ef4840ffb09fbc7b5334155ecc84561a0319e71b0aa56543368d1b699cf84270f76fa6276b1404b504a48"

RPROVIDES:${PN} += "libboost_chrono.so.1.82.0()(64bit) \
libboost_chrono1_82_0 \
libboost_chrono1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
