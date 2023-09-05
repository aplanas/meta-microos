SUMMARY = "Development package for kosmindoormap"
DESCRIPTION = "This package contains development files for the KOSM and KOSMIndoorMap libraries."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "kosmindoormap-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fc20af2eebd34b8bff981b50dffae1603c9adf5740859d8665696a62e378c2c560cce84a0057f859d3adf35955e546a7d35f72d787624fec54235d50731093f3"

RPROVIDES:${PN} += "cmake-KOSMIndoorMap \
kosmindoormap-devel"

RDEPENDS:${PN} += "libKOSM1 \
libKOSMIndoorMap1"

inherit rpm
