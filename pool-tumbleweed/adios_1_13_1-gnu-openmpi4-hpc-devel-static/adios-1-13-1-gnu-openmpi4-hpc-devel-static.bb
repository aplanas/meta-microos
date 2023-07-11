SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi4-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-devel-static-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "18f46ec94e1b016a1cfcb705dac8c17eac8c33f4e20152a85c4ab492e40272f7ca4777c78c6958ff59296ec6e1a3e01a397e75be42bcfd42a7501a9e8900cd6f"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
