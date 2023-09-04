SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-docs-qch-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "301e088289c4d67ec4df8b542c12995a5ed202d1f279c48ab19f1ab0f4218a258931badc6fa3574582fdfd7e0de5d9b79a91d5ee2b3df762d7a491a4e8e491de"

RPROVIDES:${PN} += "qt6-webengine-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
