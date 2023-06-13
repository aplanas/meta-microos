SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi1-hpc-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "46299c1a18620bfe4f0602f46b2e8e8f7be3eeb37fda19309d4b5f63ec77c603c94288eda3741441e677af56329553b31741ff101fe3dcc312f09b71d9679008"

RPROVIDES:${PN} += "adios_1_13_1-gnu-openmpi1-hpc-devel-static \
adios_1_13_1-gnu-openmpi1-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
