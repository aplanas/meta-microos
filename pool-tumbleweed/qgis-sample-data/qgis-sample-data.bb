SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-only"

PV = "3.30.2"

RPM_NAME = "qgis-sample-data-3.30.2-1.1.noarch.rpm"
RPM_HASH = "dcd59ebdbda86a8257f7fa25beb9dba746cc8566f2bb61cf02fdd25571744cd084668ec9fcee48e253f80ea83288849b3eff859b3714f30f83f791ac5e471116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"
RDEPENDS:${PN} += ""

inherit rpm
