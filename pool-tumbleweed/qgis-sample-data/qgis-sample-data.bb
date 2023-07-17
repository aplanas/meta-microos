SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-sample-data-3.30.3-2.1.noarch.rpm"
RPM_HASH = "a61daabbce4aa50615e715eb2f9a1fa910b4d123f4489e09360662dc74ba3821b7a8f220ad8545aa9e827c5baccd6bd4109a4d6dc507cd2fc21f12218e17b135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
