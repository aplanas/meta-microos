SUMMARY = "Documentation for qt6-shadertools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f8dcbfbd22a2a57eac135bb65134c2013f120f9c9cd1a7bb9e3b369c77dbd422f0c5a8dfc6de9b9a3d16eaf46d033111dedb0bbbbf1321e789fc286442cc18df"

RPROVIDES:${PN} += "qt6-shadertools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
