SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-2.1.0-1.2.aarch64.rpm"
RPM_HASH = "913b2dcc356afa7576b54129125b953b2071812c40f858e6b993c6c6f0dace59691493b053add2dd2d5677aa8638fe6ab6cbbd98ce65789eb12b59fe31d2c8fb"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so \
python3.9dist-pandas \
python39-pandas \
python39-pandas-doc \
python3dist-pandas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-python-dateutil \
python39-pytz \
timezone"

inherit rpm
