SUMMARY = "Documentation for qt6-webview in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webview in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webview-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "50b6e03dae6b6b5e2a2d117ff573b0ebaa5308fa7e4bd5d5f7444b11f81a248b7d8f1482294ca451e14640fd2cbd3152f4317dca72c9a1e53b1f74e72c853efc"

RPROVIDES:${PN} += "qt6-webview-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
