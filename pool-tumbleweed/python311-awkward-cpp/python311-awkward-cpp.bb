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

RPM_NAME = "python311-awkward-cpp-18-1.1.aarch64.rpm"
RPM_HASH = "032e7f9acecf3856ae2e5cb61285f56b8583e3aa78f7d0a4e61fc8cec327690e4867f7eed7ea6ed2749fb440ebe2e814ac29e2dc1c60a7decf09ed84de5f5a84"

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
