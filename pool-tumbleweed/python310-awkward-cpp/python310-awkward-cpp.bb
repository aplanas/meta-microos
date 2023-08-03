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

PV = "21"

RPM_NAME = "python310-awkward-cpp-21-2.1.aarch64.rpm"
RPM_HASH = "1982acb85ef1807c25decf431e07f4fec68b839b0737f340a1f443c0dc8bedbe7e9d9cf61a0a6d1c6f7fd73f6c1492152ca827ba3da6fa38f0b14a0f67804897"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3.10dist-awkward-cpp \
python310-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
