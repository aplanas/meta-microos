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

RPM_NAME = "python39-awkward-cpp-21-1.1.aarch64.rpm"
RPM_HASH = "6a3d926040484e2d24219cfba2375594168b2a11379070958e33988e4eae6130c35065ea73eb0a02490bc10fc56ee27363f0c791a2abaa3f6014e9275c2fff1b"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3.9dist-awkward-cpp \
python39-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
