SUMMARY = "Documentation for qt6-quicktimeline in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quicktimeline-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8d36c59ff7eb2164232416af670c506b018ce6a3c69202fe91d61ad3c4f51f4f66d1662e0cff0d3e1e61aef4c60329c56f752123e5dd84edaba5afe87a8723ca"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
