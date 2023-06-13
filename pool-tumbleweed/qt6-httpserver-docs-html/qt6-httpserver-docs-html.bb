SUMMARY = "Documentation for qt6-httpserver in HTML format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c721776bee1508c4a7da5712314dcd89904a39f8e23fe919a8213188d2810876e034e8c73292d95019b0f2b35779ea28a291236ee55852adab64ac8ac4d56860"

RPROVIDES:${PN} += "qt6-httpserver-docs-html \
qt6-httpserver-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
