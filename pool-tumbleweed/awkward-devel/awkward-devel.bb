SUMMARY = "Header files for using awkward in C/C++ code"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
This package provides the header files needed to compile C/C++ codes with \
awkward."
LICENSE = "BSD-3-Clause"

PV = "21"

RPM_NAME = "awkward-devel-21-2.1.aarch64.rpm"
RPM_HASH = "39bc518fad3918da2a9c73f366255d4f4dea295302f1b2bfa9a948032f8f3dbe1016a5c46b13a59f75d2e10e23b639491c75b1e9e24efff75777d8c9964d6301"

RPROVIDES:${PN} += "awkward-devel \
cmake-awkward-headers"

RDEPENDS:${PN} += ""

inherit rpm
