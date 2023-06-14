SUMMARY = "Boost.Python.NumPy runtime library"
DESCRIPTION = "This package contains the Boost.Python.NumPy runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_numpy-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "ccc8a67ed29f109037a7bc09fa05fd27e5575ed9fc62d809c26ae8ab32a70707e83605ac679e42b058449153d168ee38c63e93d38da89e980f8f4b37412d2b8c"

RPROVIDES:${PN} += "libboost-numpy-py3-1-82-0 \
libboost-numpy-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
