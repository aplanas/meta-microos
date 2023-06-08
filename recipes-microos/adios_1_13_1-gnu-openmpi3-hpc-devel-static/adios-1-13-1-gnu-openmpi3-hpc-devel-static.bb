SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi3-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi3-hpc-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "5d76a7379d1baae5e7d973b0ab9ba5b8b9fdb5a9fccb4e317bd7a22e47d1983ff38c3f488f60f9cd30377dc6bb51e000b5776e667d311973cc6e288052b320b9"

RPROVIDES:${PN} += "adios_1_13_1-gnu-openmpi3-hpc-devel-static adios_1_13_1-gnu-openmpi3-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
