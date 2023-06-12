SUMMARY = "Static libraries for adios-openmpi4"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi4 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-devel-static-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "ef64c3f951323d013733d1fe396f077bc006b79afc72eaca327dc966f01e64166dd1a4dcafd7d410009f198a5c6a90790c90bbe656aa4686ae270ea7ea3c7c09"

RPROVIDES:${PN} += "adios-openmpi4-devel-static \
adios-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
