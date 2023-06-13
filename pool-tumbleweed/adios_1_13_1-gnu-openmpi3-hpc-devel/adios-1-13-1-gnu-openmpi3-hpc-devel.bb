SUMMARY = "Development files for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi3-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi3-hpc-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "4671b70662f55360f5944e6b782e3135f642b230f695e9d91c928302cbbbd0c1f69ea0b3900e258612acb60703be4fa91a2ebf2a15d61f5f40874b9753434861"

RPROVIDES:${PN} += "adios_1_13_1-gnu-openmpi3-hpc-devel \
adios_1_13_1-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "adios_1_13_1-gnu-openmpi3-hpc \
adios_1_13_1-gnu-openmpi3-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
