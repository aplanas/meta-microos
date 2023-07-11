SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-2.0.2-4.1.aarch64.rpm"
RPM_HASH = "cf55ca035161e6a9c4782981adabf7aea730c6c73b964e3ccc45cee114560f95ec7cf795b1e82f18ee1b9760637e430cffa0cf8c768f3ab43bdb5ebcc596fa2d"

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
