SUMMARY = "Development files for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-mpich-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mpich-hpc-devel-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "191141ea3a8345b9f8fcaf59ed5714e8f77acd712d11015153e29c71cf3f2df6858be2cc6d437f09e437551659050fa4a5951da4c3a109d4c4e4b0a169e0204f"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-mpich-hpc \
adios-1-13-1-gnu-mpich-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
lua-lmod \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel"

inherit rpm
