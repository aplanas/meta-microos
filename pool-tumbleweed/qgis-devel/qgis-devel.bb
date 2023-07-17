SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-devel-3.30.3-2.1.aarch64.rpm"
RPM_HASH = "05ae093e4812f2c1c03aa409a9e67b5f138dee56b465db062d8ba9f8dad3b01af27c8af7a137a5bdbb5a4d06312d3f16c57e14ea9660399dccbb20d71f1a2b91"

RPROVIDES:${PN} += "qgis-devel"

RDEPENDS:${PN} += "python3-qt5-devel \
qgis"

inherit rpm
