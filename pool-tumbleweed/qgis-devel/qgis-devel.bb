SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-devel-3.30.3-1.1.aarch64.rpm"
RPM_HASH = "7b6ad0a3463a0e25dc8189352c20c2b1348bfa6e614ba5cfbea313a3b8fd277bbb9e08e88e43b69058a30352bff91818cff6eb70178c0441a7d8921f9cf9da42"

RPROVIDES:${PN} += "qgis-devel"

RDEPENDS:${PN} += "python3-qt5-devel \
qgis"

inherit rpm
