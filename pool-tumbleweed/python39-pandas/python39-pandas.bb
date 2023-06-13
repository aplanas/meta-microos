SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-pandas-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "7c377199423f6ebe4e8726404d4cb938cb89eb36891d1f67a721c304d8d726d3a331264153bd15d41a308d28399fd0c5546a480f6ef4ea53c0119ad2da3d94b8"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(pandas) \
python39-pandas \
python39-pandas(aarch-64) \
python39-pandas-doc \
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
python39-numpy \
python39-python-dateutil \
python39-pytz"

inherit rpm
