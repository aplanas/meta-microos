SUMMARY = "Development files for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi2-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "933c4d1e5ec1798c352780131b59ac4a99cc1db1af93457497a8b968bcd7841f218c2f94e69118af78f5941e51ba83363063558d79a3e4dc130b6e8adf1e4b91"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi2-hpc \
adios-1-13-1-gnu-openmpi2-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi2-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc-devel"

inherit rpm
