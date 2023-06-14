SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-api-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "5a8f955ff95a857f05bd8e31d7ddd33e590433d80c323a11d8265a39491050ee2afde3436d6c567cf562aaec1fb49e8143a9bf2d1687959288cda1f91e47a692"

RPROVIDES:${PN} += "containerized-data-importer-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
