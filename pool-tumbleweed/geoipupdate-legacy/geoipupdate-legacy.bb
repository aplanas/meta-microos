SUMMARY = "GeoIP Lagacy Format Updater"
DESCRIPTION = "Script for updating data in GeoIP Legacy format."
LICENSE = "Apache-2.0 | MIT"

PV = "6.0.0"

RPM_NAME = "geoipupdate-legacy-6.0.0-1.1.aarch64.rpm"
RPM_HASH = "c841fa238dfd5fa5ec9b8722deeda4a7254c19be8dd227d8f77b5883b634cb69cf8306c380dbe93b8b3266bc49a56373cc9f644e5b036266706e9df373b01833"

RPROVIDES:${PN} += "geoipupdate-legacy"

RDEPENDS:${PN} += "/usr/bin/bash \
geoipupdate \
geolite2legacy"

inherit rpm
