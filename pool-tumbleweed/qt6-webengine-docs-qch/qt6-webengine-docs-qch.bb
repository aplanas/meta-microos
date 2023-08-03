SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "60b8116146fbd9766b905103d7362b1676bcc96a8df04622b1408619b8784d058b0c84d2f17bb7e1e98eeb39d5dc1e98600fa9376ed9410e858aec6b19c34ad7"

RPROVIDES:${PN} += "qt6-webengine-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
