SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-2.1.0-1.2.aarch64.rpm"
RPM_HASH = "37fdd4ad99f72b405fdc9a436785461a646492e5dfda1b0995a47ab48f697caf9bcdbcc211369a4ee2ee53c4cb832e343aff94a5395f9960178e5b9f955a3783"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so \
python3-pandas \
python3-pandas-doc \
python3.11dist-pandas \
python311-pandas \
python311-pandas-doc \
python3dist-pandas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-python-dateutil \
python311-pytz \
timezone"

inherit rpm
