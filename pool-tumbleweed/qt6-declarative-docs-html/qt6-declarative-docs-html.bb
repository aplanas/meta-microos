SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-docs-html-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "77b81338603c6bd4a40806ee23f816f40266a1046b57793a21bf1c672b608b41a814239c007a3597853b81c7dec4b71e30de5c10969222e638c7efeeb26b4330"

RPROVIDES:${PN} += "qt6-declarative-docs-html \
qt6-quickcontrols2-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
