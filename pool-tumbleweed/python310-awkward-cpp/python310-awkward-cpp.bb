SUMMARY = "CPU kernels and compiled extensions for Awkward Array"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not. \
 \
awkward-cpp provides precompiled routines for the awkward package. \
It is not useful on its own, only as a dependency for awkward."
LICENSE = "BSD-3-Clause"

PV = "15"

RPM_NAME = "python310-awkward-cpp-15-1.1.aarch64.rpm"
RPM_HASH = "ad77814af8d9e6f67ea52704e4e39320736bb87506670624f18ccd561121c4998af1906515ac622fa469e3ff7d32ec93ed3bb8c15d3992869726a06d0f1d6abc"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3-awkward-cpp \
python3.10dist-awkward-cpp \
python310-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
