SUMMARY = "Static libraries for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi4 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "a176127d0d3712e6fee85a76fb62c15eeaa671834314eb29ddd4fede18f39060365ce0e4364e20c619e3b32663e39cc9f9ec8d619c36bbff48e9598fc273d21b"

RPROVIDES:${PN} += "adios-openmpi4-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
