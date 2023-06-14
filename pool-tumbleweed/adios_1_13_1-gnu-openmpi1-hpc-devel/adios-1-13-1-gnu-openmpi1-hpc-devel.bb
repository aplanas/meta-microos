SUMMARY = "Development files for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi1-hpc-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "85ae4649c8ef2564a1c903789645b59cc8520b5454ebdb81c60e5468393a4c31bee5e8821a878ea691f33d84d54451fd8723349835bf603c765f9ec56114b6a9"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi1-hpc \
adios-1-13-1-gnu-openmpi1-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi1-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi1-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
