SUMMARY = "Documentation for qt6-location in HTML format"
DESCRIPTION = "This package contains documentation for qt6-location in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "785eecb8251897ba091be1c2cf8e09ab62b60b1a0f81119ae7ba5932ea082d03d7434162885e1052f7dbf4dbc0d51e353725da258fa67d6dcf277395097084c0"

RPROVIDES:${PN} += "qt6-location-docs-html \
qt6-location-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
