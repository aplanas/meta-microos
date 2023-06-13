SUMMARY = "Documentation for qt6-multimedia in HTML format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "69582a7becb0fb812108a707d02a33c407839de1210f73554b69da917b6d17119c7c9ffd5e7e45698ca60a08bcb98477d658293b82986b95020293a6dd22cb59"

RPROVIDES:${PN} += "qt6-multimedia-docs-html \
qt6-multimedia-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
