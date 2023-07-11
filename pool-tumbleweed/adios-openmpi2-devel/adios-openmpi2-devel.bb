SUMMARY = "Development files for adios-openmpi2"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi2 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi2-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "c38b07ad6f798ab72762941a3dc8e17fadadff0dd0510bb5d4c4cdc6256c89e17e5a549ccbdf9fc0cf12479eb7cd7469ee8cb72a1ccec104eaefd627b44542ce"

RPROVIDES:${PN} += "adios-openmpi2-devel"

RDEPENDS:${PN} += "adios-openmpi2 \
adios-openmpi2-devel-static \
hdf5-openmpi2-devel \
netcdf-openmpi2-devel"

inherit rpm
