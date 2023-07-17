SUMMARY = "Documentation for qt6-coap in HTML format"
DESCRIPTION = "This package contains documentation for qt6-coap in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e3799d475ee9eef238eee4549e5de090dbf56696b6cd62139a0ea4f33c2018e31062fb498011c386c09c2766550658c836e3d1a0ae772a7b0d8745ef6f8b37c8"

RPROVIDES:${PN} += "qt6-coap-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
