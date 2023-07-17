SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-docs-html-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "fa7eb81e626215ce51b172abcc736db7b2837a94b39c3e9a31fc6247d68192817efcf9bbf6bb8291dc475fffe7afebceeccbaaf28c24bfb46dd09026b0719432"

RPROVIDES:${PN} += "qt6-declarative-docs-html \
qt6-quickcontrols2-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
