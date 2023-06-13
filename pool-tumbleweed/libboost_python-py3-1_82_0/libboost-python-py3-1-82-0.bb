SUMMARY = "Boost.Python runtime library"
DESCRIPTION = "This package contains the Boost.Python runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_python-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4c3b234a27eadb591b515e92d0032f1062e3c6f6aaef102c8dd37872157280d88df911f7629819a615a90d5dca5e8024368ac36109f8dc72c008059b22c4dfb5"

RPROVIDES:${PN} += "libboost_python-py3-1_82_0 \
libboost_python-py3-1_82_0(aarch-64) \
libboost_python-py3.so.1.82.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
