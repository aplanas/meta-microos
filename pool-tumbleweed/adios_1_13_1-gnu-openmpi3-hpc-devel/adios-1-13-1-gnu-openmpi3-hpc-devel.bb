SUMMARY = "Development files for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi3-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi3-hpc-devel-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "c7b85e88f1e7391a4677f061519fa8e91a4e0ed38f66dbc0f4a17fe56cb9ff3682cddbad387d7dc258477ae436afeec3eba500c2ae8e1bb4971bc0dcbdbd8922"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi3-hpc \
adios-1-13-1-gnu-openmpi3-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
