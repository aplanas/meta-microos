SUMMARY = "Documentation for qt6-imageformats in HTML format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-imageformats-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c1fce79b290a8192fef7e4d7e3ac1b1312d0762985b77e38a1b8142e1f7a6f900951987cdef9f9d9142a1c7b3e86548060b2e7d39975a05279857458e85d7f1a"

RPROVIDES:${PN} += "qt6-imageformats-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
