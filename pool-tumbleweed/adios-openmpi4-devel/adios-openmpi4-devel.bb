SUMMARY = "Development files for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "c4dffc6c11fc1f3215e6bbf23fafe08ff1077b49cdc81dc6b295e691ae0d70405b0dd5d0154f3fef2a6f2300e7fba3025c32ff87c2e9944e50364ebddefde8dc"

RPROVIDES:${PN} += "adios-openmpi4-devel \
adios-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "adios-openmpi4 \
adios-openmpi4-devel-static \
hdf5-openmpi4-devel \
netcdf-openmpi4-devel"

inherit rpm
