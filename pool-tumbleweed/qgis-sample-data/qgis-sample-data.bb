SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-sample-data-3.30.3-1.1.noarch.rpm"
RPM_HASH = "4e70789ab6a33b24d7efaccf2cf5812063eb5f1af61ef3cb33b3b315b89ea6764450d34cf7e5faf109ac6e1851eb36479b58a1799f8dd31fa4b4585a0d14a4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
