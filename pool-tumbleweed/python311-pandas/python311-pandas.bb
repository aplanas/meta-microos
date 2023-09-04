SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-2.0.3-1.2.aarch64.rpm"
RPM_HASH = "78768995f538c4dd238b04b21cf3e193f83a56821396f3faa438ab2a8f4bc3f1a45753d22f8a607cbec4df7f5298dd56dc8451a140716b56c8bffd04194e7d92"

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
