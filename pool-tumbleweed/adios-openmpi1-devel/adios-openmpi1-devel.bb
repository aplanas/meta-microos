SUMMARY = "Development files for adios-openmpi1"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi1-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "d80044f6be34769c2f8f9d167b624c78c84a59d9cb5173aca116abb047d7c741992339d694cc0e5fbc7292bbe90ca4105e44d79e6e552711edca80d110862eb4"

RPROVIDES:${PN} += "adios-openmpi1-devel"

RDEPENDS:${PN} += "adios-openmpi1 \
adios-openmpi1-devel-static \
hdf5-openmpi1-devel \
netcdf-openmpi1-devel"

inherit rpm
