SUMMARY = "Development files for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi4-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "be7cf3e213782ce26b87a29930a2ff922e3753919abacda6f44afcb3d6a98a04506c113838d499abecaf2e07e52e13b592549061e39ddc2bbf4b7f1f7a8d1e70"

RPROVIDES:${PN} += "adios_1_13_1-gnu-openmpi4-hpc-devel adios_1_13_1-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "adios_1_13_1-gnu-openmpi4-hpc adios_1_13_1-gnu-openmpi4-hpc-devel-static gnu-compilers-hpc-devel hdf5-gnu-openmpi4-hpc-devel lua-lmod netcdf-gnu-openmpi4-hpc-devel openmpi4-gnu-hpc-devel"

inherit rpm
