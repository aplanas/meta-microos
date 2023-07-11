SUMMARY = "Static libraries for adios-openmpi1"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi1-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "6649a3ae6884574dc137fe67938b5f085974f6f18e58d3de8d353196b1d84b3e0b49d9dafe36bfc3c19d83089ebbdd84b5b5fbc5b80f661f4aab2e6af461e315"

RPROVIDES:${PN} += "adios-openmpi1-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
