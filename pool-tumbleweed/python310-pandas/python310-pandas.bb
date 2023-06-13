SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-pandas-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "52b3e1fa6cb218a46b07f5d88c193555326727cc3b448170e79fd541153d81fd09820198aff453c32fc94faffb74e62b535e1e633fc49a4694f920f1601f5275"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-pandas \
python3-pandas-doc \
python3.10dist(pandas) \
python310-pandas \
python310-pandas(aarch-64) \
python310-pandas-doc \
python3dist(pandas)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy \
python310-python-dateutil \
python310-pytz"

inherit rpm
