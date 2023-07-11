SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-2.0.2-4.1.aarch64.rpm"
RPM_HASH = "c4d8fa075450f55cd106178dc81e1a48397176fd61a94f92204a699c3c156e866c718fca21e0a07f64fe5560d24e4a09ed2fe9ce66ba22280a3b6677b1c73468"

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
