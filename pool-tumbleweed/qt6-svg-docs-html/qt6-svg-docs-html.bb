SUMMARY = "Documentation for qt6-svg in HTML format"
DESCRIPTION = "This package contains documentation for qt6-svg in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-svg-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "361e2e2650932175eb76a2ee8680ec01959640362acd3844449e36d6184121fd41c62e0c40ab6b6d21b9402a9853228b03d375502738070250cf9ab1d8e9c651"

RPROVIDES:${PN} += "qt6-svg-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
