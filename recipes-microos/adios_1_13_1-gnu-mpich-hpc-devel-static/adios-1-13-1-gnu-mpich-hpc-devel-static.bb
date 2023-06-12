SUMMARY = "Static libraries for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-mpich-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mpich-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "d40debf10fe5f601fb3c5371c049e53c6a0689ad07864dbf8866a50d7a2999d27c8549949bdc38a7852a881d66f4ca659a0881ef25186b7b24a278948dae6b4a"

RPROVIDES:${PN} += "adios_1_13_1-gnu-mpich-hpc-devel-static \
adios_1_13_1-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
