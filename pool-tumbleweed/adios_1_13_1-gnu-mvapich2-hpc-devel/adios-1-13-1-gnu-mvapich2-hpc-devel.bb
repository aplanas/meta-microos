SUMMARY = "Development files for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-mvapich2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-devel-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "40e6d801467d7774d123c2a424be74abd73dd196f6806e52b77c72201046cc6a038028148592c4eaab637cfa96ff33c99cd167658bf5cd3e43b8a28f55e8bff7"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-mvapich2-hpc \
adios-1-13-1-gnu-mvapich2-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-mvapich2-hpc-devel \
lua-lmod \
mvapich2-gnu-hpc-devel \
netcdf-gnu-mvapich2-hpc-devel"

inherit rpm
