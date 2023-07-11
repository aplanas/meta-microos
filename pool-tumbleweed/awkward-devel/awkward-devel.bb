SUMMARY = "Header files for using awkward in C/C++ code"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
This package provides the header files needed to compile C/C++ codes with \
awkward."
LICENSE = "BSD-3-Clause"

PV = "18"

RPM_NAME = "awkward-devel-18-1.1.aarch64.rpm"
RPM_HASH = "81a04d0b647a51dc10d5fa20e05327cb806c1a2b0267a0ef33b235e66a51580d614d8c26209cfbe1df98773a879f8457d6e854d6cd678073fce79b139cc1901b"

RPROVIDES:${PN} += "awkward-devel \
cmake-awkward-headers"

RDEPENDS:${PN} += ""

inherit rpm
