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

PV = "18"

RPM_NAME = "python310-awkward-cpp-18-1.1.aarch64.rpm"
RPM_HASH = "17f327333a2a9a24e4a5ac5797cb2503d5dcd0942cc0ddc53a10821176313086b0f1bcb4ffceb295b876e8ecd7a7464c02c2d87937daa67f3c1e92be8c50db5a"

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
