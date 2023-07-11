SUMMARY = "Documentation for GRASS GIS 7"
DESCRIPTION = "This package contains the HTML documentation files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-doc-8.2.1-1.4.aarch64.rpm"
RPM_HASH = "b8ffd0aa371731c598dc5c99f3fdcb4897dc83669904e12058d17177484f3cb9e60f04ebe68f30c758a0a7e9d95992689e3b60b8acd3f22e3fedd2ec7cd41f81"

RPROVIDES:${PN} += "grass-doc"

RDEPENDS:${PN} += ""

inherit rpm
