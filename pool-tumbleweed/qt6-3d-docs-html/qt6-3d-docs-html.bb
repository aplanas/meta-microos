SUMMARY = "Documentation for qt6-3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-3d-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "aa98a05a9a9ee867257c1c3e540ab817678369cdfcab67a901b40d9bccf392f61ac064c0a428cc449a78832d367f2c4902e98168435c0480fdfcc3f6905fcb01"

RPROVIDES:${PN} += "qt6-3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
