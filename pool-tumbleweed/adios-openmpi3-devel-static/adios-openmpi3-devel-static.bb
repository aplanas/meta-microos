SUMMARY = "Static libraries for adios-openmpi3"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi3 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi3-devel-static-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "3c714d91f899c4112cb45a58a779a0c4457d3dd5bac7c8ecd1c80d38b4f00c4a0aeaed0782af34090cae22e5f652928d9b5f464109f8055281565045a3b21b43"

RPROVIDES:${PN} += "adios-openmpi3-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
