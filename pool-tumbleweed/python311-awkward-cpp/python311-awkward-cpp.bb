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

RPM_NAME = "python311-awkward-cpp-21-2.1.aarch64.rpm"
RPM_HASH = "f13cfd6b112518c73367349daa39da787803bda385b23d370e4257f335542c2dfbd0166320e7e61cf9fe376322c484c3a3e6c04d3ee6e6211391647afb18a06b"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3-awkward-cpp \
python3.11dist-awkward-cpp \
python311-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
