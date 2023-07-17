SUMMARY = "Documentation for qt6-virtualkeyboard in HTML format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1668afd9354d8204328760df29e37e1cb5fa7dcfc77a024247546160a8d2ee76e985cf6dc132c52effa8b982365282219c484678baabcc605f67abe892a0a375"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
