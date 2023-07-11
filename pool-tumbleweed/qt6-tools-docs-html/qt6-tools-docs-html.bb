SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a5f5f4b013435cc55a142578910fc8dff04b7ac616a7acd0eb57286e5cdfa49df0e200ef3b7db79dfdeeb9e58ea9d56ec14524a817b5463b41c2e024c4cbadbc"

RPROVIDES:${PN} += "qt6-tools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
