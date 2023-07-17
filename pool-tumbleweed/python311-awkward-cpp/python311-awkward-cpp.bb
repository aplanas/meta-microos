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

RPM_NAME = "python311-awkward-cpp-21-1.1.aarch64.rpm"
RPM_HASH = "5fbd93b95248ee36b503bf22127453d5d56251b5c92e57b752fb62fcf4c8f54ce8a8e3fa093a7beb2c6794f8ccd09f27c33d7945de1a065d1d4faa84f95865f0"

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
