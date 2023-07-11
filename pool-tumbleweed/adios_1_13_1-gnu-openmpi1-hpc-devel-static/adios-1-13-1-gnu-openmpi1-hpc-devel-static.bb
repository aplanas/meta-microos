SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi1-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "efa52852fa9bb327cba2617fedf3a8dc552179d22651634edf00a275d3b1a862926fbde56a4b913402eba74378e4c81c48f0342990865152b4305afdcd8000bc"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
