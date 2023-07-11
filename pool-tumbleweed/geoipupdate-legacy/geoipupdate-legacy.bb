SUMMARY = "GeoIP Lagacy Format Updater"
DESCRIPTION = "Script for updating data in GeoIP Legacy format."
LICENSE = "Apache-2.0 | MIT"

PV = "5.1.1"

RPM_NAME = "geoipupdate-legacy-5.1.1-1.1.aarch64.rpm"
RPM_HASH = "75cabe1094e5f8da5299586829eee38b00d630f7c2f69abe8eb47a5cf66dd2e9ae566d425611d989cc2a5d3d24605c444e95969d3e8f934943b0ee7b902695d1"

RPROVIDES:${PN} += "geoipupdate-legacy"

RDEPENDS:${PN} += "/usr/bin/bash \
geoipupdate \
geolite2legacy"

inherit rpm
