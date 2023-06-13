SUMMARY = "Header files for using awkward in C/C++ code"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
This package provides the header files needed to compile C/C++ codes with \
awkward."
LICENSE = "BSD-3-Clause"

PV = "15"

RPM_NAME = "awkward-devel-15-1.1.aarch64.rpm"
RPM_HASH = "d62a860dd7c85060fb2443b8e07bff756ce1839ab4696566fb8d131f39612731052bf127f40bb3f9a7ef8a02cff5caa22416fd1e5d7037c1ddd989de3a7261bc"

RPROVIDES:${PN} += "awkward-devel \
awkward-devel(aarch-64) \
cmake(awkward-headers)"

RDEPENDS:${PN} += ""

inherit rpm
