SUMMARY = "GeoIP Lagacy Format Updater"
DESCRIPTION = "Script for updating data in GeoIP Legacy format."
LICENSE = "Apache-2.0 | MIT"

PV = "5.0.3"

RPM_NAME = "geoipupdate-legacy-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "273a337c449ad09398bf165f5178dcc95a536a87899f384a525dedaf9c1bef7861a9592992e4cce6c4771a2d580024e233c52320d9bf7ba35e86c999fbd0d3b4"

RPROVIDES:${PN} += "geoipupdate-legacy \
geoipupdate-legacy(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
geoipupdate \
geolite2legacy"

inherit rpm
