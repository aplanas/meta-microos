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

RPM_NAME = "python310-awkward-cpp-21-1.1.aarch64.rpm"
RPM_HASH = "be25ac8f75d6739e714105bc0336fb4850e65ec430a289c85785824711b244cbca2098e7a587a313bde883fc8e085ee9fa7f2a9e435f5be92eca39d234f13f48"

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
