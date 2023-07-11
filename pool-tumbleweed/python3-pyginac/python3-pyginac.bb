SUMMARY = "Python bindings for ginac - a symbolic manipulation library"
DESCRIPTION = "PyGiNaC is a Python package that provides an interface to the C++ library \
GiNaC, which is an open framework for symbolic computation within C++. PyGiNaC \
is implemented with the help of the Boost.Python library."
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "python3-pyginac-1.5.5-2.24.aarch64.rpm"
RPM_HASH = "d8bd36dd9436f31a8c76cc66e18953525174ebf3c5e381bea905b1f7d3b29430a2137982c075cabd42b6923c7b00652e04d2b519a17847c3f1c61f65258f3b28"

RPROVIDES:${PN} += "python3-pyginac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libginac.so.11 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
