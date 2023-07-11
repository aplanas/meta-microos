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

RPM_NAME = "python39-awkward-cpp-18-1.1.aarch64.rpm"
RPM_HASH = "5d147125d8dd40e1366ac1be016fc661c4191bf7940c8f0001ae6288b33c0806f9e0709f9f397ae801cb352db7fdee9960a327a18abd9f44b3fe6ca997daadd2"

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
