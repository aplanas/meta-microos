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

RPM_NAME = "python39-awkward-cpp-21-2.1.aarch64.rpm"
RPM_HASH = "f774fdd0c51a2a06d425c72f8b9593a56e2040eac80bb418abc5095dc9d093b47c53aa64dcfaa3db07c732aea576c4663730b44bb13f9a97fbe588e0d0872567"

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
