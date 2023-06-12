SUMMARY = "Bogofilter documentation"
DESCRIPTION = "This package contains the documentation of bogofilter"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-doc-1.2.4-15.12.noarch.rpm"
RPM_HASH = "4d467c7b492ba1782ec28a07c49e09056e4d0262fc7d4f5b886e3d7b01586a35ee30732f3226d870c35ee8a3d9d9eb6da2e6fcb727086530d229c004beafef9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-doc"
RDEPENDS:${PN} += ""

inherit rpm
