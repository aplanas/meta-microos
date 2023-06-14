SUMMARY = "Documentation for qt6-positioning in QCH format"
DESCRIPTION = "This package contains documentation for qt6-positioning in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d732dbc7b343b6590d5000744f111119c72c5da2b6a65378675be74a7a3d6f88d38a437d2416e8a00411ddb197e90a6879b81d86db24ae67739d58e3f4f1e2c2"

RPROVIDES:${PN} += "qt6-location-docs-qch \
qt6-positioning-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
