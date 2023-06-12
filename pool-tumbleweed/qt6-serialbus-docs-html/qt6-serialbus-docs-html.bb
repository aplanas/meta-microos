SUMMARY = "Documentation for qt6-serialbus in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b570476175635d9703e4edf1793cc2cdb19b8d7959ea65de999e630c8109b0aef3af2502eb8f850020ab6b48fb8481623e9b6ebfb578a169a8faba033d07b81b"

RPROVIDES:${PN} += "qt6-serialbus-docs-html \
qt6-serialbus-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
