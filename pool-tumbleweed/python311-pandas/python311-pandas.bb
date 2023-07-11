SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-2.0.2-4.1.aarch64.rpm"
RPM_HASH = "468134f5e7857f462acad8a5393e24e219794dbcb3892957f82bdcee7d236e8e2e06aa25264f7d71ab059908afadcda00c076ec9c668280a108fd1c498afe696"

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
