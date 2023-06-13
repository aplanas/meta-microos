SUMMARY = "Boost.JSON runtime library"
DESCRIPTION = "This package contains Boost::JSON runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_json1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b5700284da2971e0d470d5d45edffa8670fcfdba95f68cb7b7371818c3ca1a636bad5369c4c10e8809fc904c24de41002abd84761c2e2a60b13f8a06ae0bf10a"

RPROVIDES:${PN} += "libboost_json.so.1.82.0()(64bit) \
libboost_json1_82_0 \
libboost_json1_82_0(aarch-64)"

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
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
