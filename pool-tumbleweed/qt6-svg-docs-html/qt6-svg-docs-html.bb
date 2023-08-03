SUMMARY = "Documentation for qt6-svg in HTML format"
DESCRIPTION = "This package contains documentation for qt6-svg in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-svg-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0cabb1bf1ae338d0e1e0ee5329e53b9d141bd3c57d2628c278ab8f025edb95cdbbfba3a287b28f6213e18e3c4b8b26863776bdf1152513f7aea6bacfe8739c55"

RPROVIDES:${PN} += "qt6-svg-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
