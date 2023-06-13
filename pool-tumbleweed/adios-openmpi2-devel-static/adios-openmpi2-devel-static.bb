SUMMARY = "Static libraries for adios-openmpi2"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi2 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi2-devel-static-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "d45c41b8dbcaa28d6efac39e24b504ef021cc468333a5bdeee5ee756f8637b94a1cbd7278210b9d8b71cfe00b67622cf5032a602ee127523552515f203859be8"

RPROVIDES:${PN} += "adios-openmpi2-devel-static \
adios-openmpi2-devel-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
