SUMMARY = "Documentation for qt6-quick3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fd4d946067fb7f31a5f1b32ba428947da557b79df77ad1fa01f86d0a79b6d19b25e461554a4d5578b376750474dbf6cb6ce8c4a485303868339c9a02a1cf2d61"

RPROVIDES:${PN} += "qt6-quick3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
