SUMMARY = "Development files for adios-openmpi2"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi2 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi2-devel-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "39c5080f8c44465f3d7f7e8ab5f72a3f13401bba9af23dbad5489be993fc44f4e50f0f216a8ba15a906d20163245eedb1f682dfc2287701f6e60046a5b1bf284"

RPROVIDES:${PN} += "adios-openmpi2-devel"

RDEPENDS:${PN} += "adios-openmpi2 \
adios-openmpi2-devel-static \
hdf5-openmpi2-devel \
netcdf-openmpi2-devel"

inherit rpm
