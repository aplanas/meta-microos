SUMMARY = "Boost.Regex runtime library"
DESCRIPTION = "This package contains the Boost.Regex runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_regex1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "f0ebe9c4c9b96967915a131ff4f1c3007b18c02dc32a975511c688a110a2208f52de66381833d8376b77d7463446347f2c940c2ca7e437b611b81cbef2e5fdb2"

RPROVIDES:${PN} += "libboost_regex.so.1.82.0()(64bit) \
libboost_regex1_82_0 \
libboost_regex1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
