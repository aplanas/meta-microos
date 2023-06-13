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

RPM_NAME = "python311-awkward-cpp-15-1.1.aarch64.rpm"
RPM_HASH = "314b73048728d95de7e989bedb0e0250410cdeb06ce2e7c4a5ef87af9b258aadcc71f0b312d5f5af81713566ea6351d0a8cec758d21f1bf16c74ed356e97532c"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so()(64bit) \
libawkward.so()(64bit) \
python3.11dist(awkward-cpp) \
python311-awkward-cpp \
python311-awkward-cpp(aarch-64) \
python311-awkward_cpp \
python3dist(awkward-cpp)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
