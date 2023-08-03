SUMMARY = "Documentation for qt6-qt5compat in QCH format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-qt5compat-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a967071bd79873f4ae6fe0763bd2fe47f1255e8617b6aeefef7366fa45771344864f2ca8cee4d1aeebede209578b05f2e274075661b65e33b5fd24adfde227f3"

RPROVIDES:${PN} += "qt6-qt5compat-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
