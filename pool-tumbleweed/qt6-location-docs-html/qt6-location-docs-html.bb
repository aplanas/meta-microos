SUMMARY = "Documentation for qt6-location in HTML format"
DESCRIPTION = "This package contains documentation for qt6-location in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f4eb356a4cf9888f8dde775a0bc4963738745fad6bd340bca895848a165221bd57fad4a956edfbb13f003ccd7099e3d30260132224d1acc9cd64c9ce3c99d5bc"

RPROVIDES:${PN} += "qt6-location-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
