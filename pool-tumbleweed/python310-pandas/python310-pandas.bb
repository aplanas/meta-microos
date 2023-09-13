SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-2.1.0-1.2.aarch64.rpm"
RPM_HASH = "6c9f14bc639d0e3476465901185b2aaec5435c7252554a53c94704a735cd652865b7eef7384315325fc7d3533ac689ebcdb5858d50ea5404e98ce8d755d694b8"

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
