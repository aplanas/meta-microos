SUMMARY = "Documentation for qt6-connectivity in HTML format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "60b5f95572699e39ff84331c13cde3e3f9556954fd28bc1d3fab64849ec80fe1ddd4cd6d198a3341ced642ec6918449b48c91b5a4bd409411d83a32b2a540d20"

RPROVIDES:${PN} += "qt6-connectivity-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
