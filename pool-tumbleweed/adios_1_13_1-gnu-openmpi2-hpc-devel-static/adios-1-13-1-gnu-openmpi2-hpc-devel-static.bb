SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi2-hpc-devel-static-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "fa43487697b4827e35a8b650d1babc97f33249287bfde69ace7ffe20acb3d87c3895d09e6e4973b7627010767e05f54bc823b54a34e9b426171a467a1d9f3f02"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
