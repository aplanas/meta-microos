SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi2-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "c28ece20c8832776a040af3944f6bbaf36447c2286b8f806ff96d17445ae18f5c6aaa096761fed683b7763aa34b12bd0f109bd1f4f5599c2f170aed3778977fe"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
