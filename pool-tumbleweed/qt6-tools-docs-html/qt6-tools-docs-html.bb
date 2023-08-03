SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-tools-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3b0a72fd10d658cd618863042e9eacbf7d9283f445406c1c43251a2d02d04889902c0884c4f7090d20a124579f0158ac4ce7b8af2b25953c477b5317527ccc1e"

RPROVIDES:${PN} += "qt6-tools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
