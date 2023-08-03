SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-only"

PV = "3.32.0"

RPM_NAME = "qgis-devel-3.32.0-1.1.aarch64.rpm"
RPM_HASH = "49da915e00121e19d012ec31defcc4ecb30815579c33154602245d642b860b27d7039da776ecfd4030ffb5e2a4cc4dc1cfb4e44a0a6663335b8c9ae999c4c9f0"

RPROVIDES:${PN} += "qgis-devel"

RDEPENDS:${PN} += "python3-qt5-devel \
qgis"

inherit rpm
