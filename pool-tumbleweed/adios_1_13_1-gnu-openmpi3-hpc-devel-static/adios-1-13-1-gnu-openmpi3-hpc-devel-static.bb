SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi3-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi3-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "6a48aac84060951d2eb87487d516f13c2ac589bf7ec9f3057e30e178e61dcc01a441debf80b2937bd6e60a212c8845d6540082ba2e4de587c7c11eb16ad1ead4"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
