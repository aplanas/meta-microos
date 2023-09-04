SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-2.0.3-1.2.aarch64.rpm"
RPM_HASH = "e4374939553ab465b3cc1f34cdfadbf3874fb375232c4c4396128348be6fcb8e3e02edc9f6ba3b19ee210297444480f8e3cc1cc2bff2850000aeb87a30199f5d"

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
