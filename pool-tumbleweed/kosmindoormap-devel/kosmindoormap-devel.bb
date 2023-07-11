SUMMARY = "Development package for kosmindoormap"
DESCRIPTION = "This package contains development files for the KOSM and KOSMIndoorMap libraries."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "kosmindoormap-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "56d53e185b033a5e607ef9b2cb129293aa6560f69fcc992faaf189293e98a67f1d9ee3867083e111fc1d1962ccdca7678cc56cbef20111b6a255f6a007549f7a"

RPROVIDES:${PN} += "cmake-KOSMIndoorMap \
kosmindoormap-devel"

RDEPENDS:${PN} += "libKOSM1 \
libKOSMIndoorMap1"

inherit rpm
