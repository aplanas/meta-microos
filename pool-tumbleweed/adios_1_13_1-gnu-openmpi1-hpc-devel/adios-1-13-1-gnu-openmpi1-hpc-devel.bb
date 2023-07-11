SUMMARY = "Development files for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi1-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "a86d354d2e44894de3d541c6db344e5349f03fdd286203f82d9a24405db71754e4439cf3476b1ff6f756457e575e1245e9de275b74d1d1d2b50d3e45ac2690d2"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi1-hpc \
adios-1-13-1-gnu-openmpi1-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi1-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi1-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
