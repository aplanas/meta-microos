SUMMARY = "Development files for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi4-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-devel-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "7d0d2a1f628ae9f9845b2e12dcf56bd7fa458353aecb82e4c44e6cfaa0ee657ac713b777d13c5951dd11f40e5b1da6ee0c8d6458b5b345fae298e49f824c1d80"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "adios-1-13-1-gnu-openmpi4-hpc \
adios-1-13-1-gnu-openmpi4-hpc-devel-static \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi4-hpc-devel \
lua-lmod \
netcdf-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
