SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c2ddfb11d051ad3530c3c1535af5cb1efa35f7b76f2f5a6e0887a707af4110759bab49a836cc3dda8f7312764953a44c98a2d42aec7372e093dc808b926db14d"

RPROVIDES:${PN} += "qt6-webengine-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
