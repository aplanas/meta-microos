SUMMARY = "Development files for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi2-hpc-devel-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "09b8123d676c950395b510a029f56c6b6269fd61297850b50f94f7e3b2dbf86e7fc2c16122ac2fbe7270fbc3d891566eac8672a98262ef54756aa142826315f3"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi2-hpc \
adios-1-13-1-gnu-openmpi2-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi2-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc-devel"

inherit rpm
