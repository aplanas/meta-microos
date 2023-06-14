SUMMARY = "Development files for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-mpich-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mpich-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "c8d8beb7a588f533a0122656d7c2db173db1c37b9e0c756f47a8eec3d32907cd3ac88bfb6c60cfbe3049fca6c773665364220e17d3bd97d20fd866c6f695de96"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-mpich-hpc \
adios-1-13-1-gnu-mpich-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
lua-lmod \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel"

inherit rpm
