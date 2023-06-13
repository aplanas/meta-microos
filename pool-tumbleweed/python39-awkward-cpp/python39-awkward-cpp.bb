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

RPM_NAME = "python39-awkward-cpp-15-1.1.aarch64.rpm"
RPM_HASH = "016e157566c7f636ac77f4ad5469d2ed2d80087e2abccefbf8670712745226e9c5116a3284a58e3045f112954f0e2796a7e869ca9fa931af85da865ccba2910d"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so()(64bit) \
libawkward.so()(64bit) \
python3.9dist(awkward-cpp) \
python39-awkward-cpp \
python39-awkward-cpp(aarch-64) \
python39-awkward_cpp \
python3dist(awkward-cpp)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
