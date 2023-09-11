SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-2.0.3-1.3.aarch64.rpm"
RPM_HASH = "e15131160a93677eed1f3537a42d85a1a4a69a6887a0417e62b82de660f34e905f8c603c769ac2226ed090524225476e1e380ef4b14de7b7d3d1b20ea7e40cb2"

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
