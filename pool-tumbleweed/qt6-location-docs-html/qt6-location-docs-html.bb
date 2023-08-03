SUMMARY = "Documentation for qt6-location in HTML format"
DESCRIPTION = "This package contains documentation for qt6-location in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "348f609e28b95b61f795731a61a8823f5eec0712e2a9d936f1eb02e01ca546968c03730f29820a5a833bbc24380314fea6af2293a545b0bedde11f47c0b1d72a"

RPROVIDES:${PN} += "qt6-location-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
