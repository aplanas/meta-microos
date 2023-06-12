SUMMARY = "Development files for adios-openmpi1"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi1-devel-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "ef1f4b763e66ff070c7b6088644ccf5a9f51e9872859bdc2d270ee0aaca25d2ee1338522d40ba4d475c1b53cc900564f0c938f035323439716a5716462f9e7f1"

RPROVIDES:${PN} += "adios-openmpi1-devel \
adios-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "adios-openmpi1 \
adios-openmpi1-devel-static \
hdf5-openmpi1-devel \
netcdf-openmpi1-devel"

inherit rpm
