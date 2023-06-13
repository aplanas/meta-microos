SUMMARY = "Development files for adios-openmpi3"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi3 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi3-devel-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "85db618a1a8bc5a0eb3cb01f390b041388ffc15b12d0260fd59dc4540ce1b00b53468144535a08088389d4f32d9c94708387d0de691cd87470d074f89b398f17"

RPROVIDES:${PN} += "adios-openmpi3-devel \
adios-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "adios-openmpi3 \
adios-openmpi3-devel-static \
hdf5-openmpi3-devel \
netcdf-openmpi3-devel"

inherit rpm
