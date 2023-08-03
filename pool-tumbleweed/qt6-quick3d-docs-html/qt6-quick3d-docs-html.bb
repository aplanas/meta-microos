SUMMARY = "Documentation for qt6-quick3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0895a2195ccbfaa23b6e1a84681ca6300cfbafd3ee14d2f6de29105e09c8f0575155908fd9b5b5b904beeaf31da948e7d059a0e11f44aca786be565083ebfaf6"

RPROVIDES:${PN} += "qt6-quick3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
