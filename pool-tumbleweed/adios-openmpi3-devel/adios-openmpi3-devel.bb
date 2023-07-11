SUMMARY = "Development files for adios-openmpi3"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all files needed to create projects that use \
the openmpi3 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi3-devel-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "19aa12fe0c11b17f26a92f706df89b7026541ada196a787ec95e22f5dee5e44b738621a535c0c2c4d4bb6ed4cab9ff2ddf7dc50730fab7af54ce5e80079f3689"

RPROVIDES:${PN} += "adios-openmpi3-devel"

RDEPENDS:${PN} += "adios-openmpi3 \
adios-openmpi3-devel-static \
hdf5-openmpi3-devel \
netcdf-openmpi3-devel"

inherit rpm
