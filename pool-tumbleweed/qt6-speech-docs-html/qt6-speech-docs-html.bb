SUMMARY = "Documentation for qt6-speech in HTML format"
DESCRIPTION = "This package contains documentation for qt6-speech in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-speech-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "86e622c15c1911ae7b37c0cbce9cfdab082008aa420452c8e2685e4cc2ae0dec6a30da89af59dd6851f057700c7fa7bc701d3428e7446a926dabf60ba268505c"

RPROVIDES:${PN} += "qt6-speech-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
