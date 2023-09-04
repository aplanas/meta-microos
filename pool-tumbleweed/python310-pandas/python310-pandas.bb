SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-2.0.3-1.2.aarch64.rpm"
RPM_HASH = "bfc865f739bd3384af32f53a83582dac1e7232a66ae9b5c7bfc2ba712f838cb3c4144eed1667ea0d2cbeac3f475ac13c1a210a6602bc4dccd2763ece7e4bf12a"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
python3.10dist-pandas \
python310-pandas \
python310-pandas-doc \
python3dist-pandas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-python-dateutil \
python310-pytz \
timezone"

inherit rpm
