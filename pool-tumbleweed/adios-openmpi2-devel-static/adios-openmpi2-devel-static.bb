SUMMARY = "Static libraries for adios-openmpi2"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the openmpi2 version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-openmpi2-devel-static-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "1e7e4a48dd91a8ae1a6f08b0465a68c9263c55fa99fbde3284a53089424e7a19c675ed42409548a418c5bcd5d7ecbc28edf1144cbc95b4a313602edeb9ecc220"

RPROVIDES:${PN} += "adios-openmpi2-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
