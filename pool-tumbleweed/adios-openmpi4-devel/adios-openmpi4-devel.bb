SUMMARY = "Development files for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "b2a73a08cf78f2579eff69b6d5d5448e263355098d4913bf3b0fda161e0dc26c5e323b2fdc99af5bbc32813ea117c9ef4480d10c185eea21a2fcb1149ee0d5bd"

RPROVIDES:${PN} += "adios-openmpi4-devel"

RDEPENDS:${PN} += "adios-openmpi4 \
adios-openmpi4-devel-static \
hdf5-openmpi4-devel \
netcdf-openmpi4-devel"

inherit rpm
