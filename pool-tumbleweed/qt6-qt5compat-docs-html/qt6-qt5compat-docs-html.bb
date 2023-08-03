SUMMARY = "Documentation for qt6-qt5compat in HTML format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-qt5compat-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6041f251c1415a60b8c58d8c8f0bc7ef0510dce4829d8db5dbffc4cedd345a3704bd3b064200d779316ad907dd95d2c1021061d6b6f28e436b6c8e9f11b4aa24"

RPROVIDES:${PN} += "qt6-qt5compat-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
