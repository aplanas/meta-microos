SUMMARY = "Documentation for libbladeRF"
DESCRIPTION = "HTML documentation files for libbladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "libbladeRF2-doc-2.5.0-16.4.aarch64.rpm"
RPM_HASH = "b8b11ac6d9c210a1fd2aa3812af3381ab59a920d768eaf6a3f37b46bad821059216ebfd6b9e21bebde2b0cc850a0290579a80247813c86e61eb3dc68893f877e"

RPROVIDES:${PN} += "libbladeRF2-doc"

RDEPENDS:${PN} += ""

inherit rpm
