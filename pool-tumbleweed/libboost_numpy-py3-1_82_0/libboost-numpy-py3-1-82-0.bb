SUMMARY = "Boost.Python.NumPy runtime library"
DESCRIPTION = "This package contains the Boost.Python.NumPy runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_numpy-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "ccc8a67ed29f109037a7bc09fa05fd27e5575ed9fc62d809c26ae8ab32a70707e83605ac679e42b058449153d168ee38c63e93d38da89e980f8f4b37412d2b8c"

RPROVIDES:${PN} += "libboost_numpy-py3-1_82_0 \
libboost_numpy-py3-1_82_0(aarch-64) \
libboost_numpy-py3.so.1.82.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
