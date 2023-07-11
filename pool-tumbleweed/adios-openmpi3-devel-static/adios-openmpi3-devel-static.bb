SUMMARY = "Static libraries for adios-openmpi3"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi3 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi3-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "e2a3861b8b33c10d9455cba3f428861f53656840c5186a89347cab4a2f011bb6ff9601c695f9b1cb1aa3270bfd24f05590ac535af767e6fc8859025f00934549"

RPROVIDES:${PN} += "adios-openmpi3-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
