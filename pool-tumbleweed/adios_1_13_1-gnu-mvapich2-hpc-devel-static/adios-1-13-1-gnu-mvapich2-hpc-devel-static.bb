SUMMARY = "Static libraries for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-mvapich2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "61cb072ed854d34aff4de2afd87773d74b07af4df7810b34e1b91f8a565177b9bf0b3a2f608348ebc47b9e9c782b65f8e66120289df70447f3d6f2f4caf7aa4c"

RPROVIDES:${PN} += "adios_1_13_1-gnu-mvapich2-hpc-devel-static \
adios_1_13_1-gnu-mvapich2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
