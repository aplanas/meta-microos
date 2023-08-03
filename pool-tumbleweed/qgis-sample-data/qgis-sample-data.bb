SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-only"

PV = "3.32.0"

RPM_NAME = "qgis-sample-data-3.32.0-1.1.noarch.rpm"
RPM_HASH = "fd50bcb4e5b5f67e6c98cde13afd5fcdb3ff4b01823057b841ed9de9233a2ed7711650187a747eac998f31b46572b77497cd7b5e30e1006868615f4d160bf96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
