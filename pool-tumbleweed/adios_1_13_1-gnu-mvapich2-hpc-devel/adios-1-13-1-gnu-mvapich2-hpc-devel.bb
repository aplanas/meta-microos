SUMMARY = "Development files for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-mvapich2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "92da416e563d2c3aac9291cd49d4b04813d0a8bdf329a44a3075df3f6010951cf940958fd2a09fb26238887a5d32e0c6c9f29372ab481b2a17d488aabdcd5b9e"

RPROVIDES:${PN} += "adios_1_13_1-gnu-mvapich2-hpc-devel \
adios_1_13_1-gnu-mvapich2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "adios_1_13_1-gnu-mvapich2-hpc \
adios_1_13_1-gnu-mvapich2-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-mvapich2-hpc-devel \
lua-lmod \
mvapich2-gnu-hpc-devel \
netcdf-gnu-mvapich2-hpc-devel"

inherit rpm
