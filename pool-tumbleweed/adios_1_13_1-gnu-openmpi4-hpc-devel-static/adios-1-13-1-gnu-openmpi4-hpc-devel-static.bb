SUMMARY = "Static libraries for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-openmpi4-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-devel-static-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "e21f624b7325a3e3c20ffaaa9bf56735cbe8ecdb6d1fd274d7a8aca25396e7f2f40142486e20d3eb575d373694be8026bc58c3d45a81fe406364a159d79fb164"

RPROVIDES:${PN} += "adios_1_13_1-gnu-openmpi4-hpc-devel-static \
adios_1_13_1-gnu-openmpi4-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
