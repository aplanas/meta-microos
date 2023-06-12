SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-pandas-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "0a2ab87573d6b6786f23c2d657437753ce59e5a10f92ce6e18966f9f40cc576f7295627f4aadf96ae6be4c56bde9312f2d6449ca814322624927e1ccb55aeb2d"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(pandas) \
python311-pandas \
python311-pandas(aarch-64) \
python311-pandas-doc \
python3dist(pandas)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python311-numpy \
python311-python-dateutil \
python311-pytz"

inherit rpm
