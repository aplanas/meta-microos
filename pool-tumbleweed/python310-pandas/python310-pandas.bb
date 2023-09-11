SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-2.0.3-1.3.aarch64.rpm"
RPM_HASH = "fd5227285c40a56875d7bb35fa88f245188f9e5916d2e41f2c8108a91061f1c62362e83f0ecf9e9271cf47870f5360b748b41a9e7d35643b26abe6f68d4666cb"

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
