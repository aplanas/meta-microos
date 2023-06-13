SUMMARY = "Static libraries for adios-openmpi1"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi1-devel-static-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "702782bd80c5cb0c8b4855c97eb7d4c94e57d6e2482c6e5efe7e72d6c6e7ee4bc472349bdd1810d85ad351b60871db53c28164ca8609a5005505f9673a4dc509"

RPROVIDES:${PN} += "adios-openmpi1-devel-static \
adios-openmpi1-devel-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
