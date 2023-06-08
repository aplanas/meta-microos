SUMMARY = "GeoIP Lagacy Format Updater"
DESCRIPTION = "Script for updating data in GeoIP Legacy format."
LICENSE = "Apache-2.0 | MIT"

PV = "5.0.3"

RPM_NAME = "geoipupdate-legacy-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "5a4fcc93377f6695de9463ab860b02980dfdbadedd58a51317e31ca66fa82764cb6ad3b81b88b986bc0108f629c0278a2667ecbc7df5f9f67ac05d70072de4a3"

RPROVIDES:${PN} += "geoipupdate-legacy geoipupdate-legacy(aarch-64)"
RDEPENDS:${PN} += "/bin/bash geoipupdate geolite2legacy"

inherit rpm
