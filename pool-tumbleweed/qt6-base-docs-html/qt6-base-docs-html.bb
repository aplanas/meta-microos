SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-html-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "54f41f8c11818816add091a227ffd8d0ab7a987d87ac8630526f98330a136c3b6ec8b67b1644f5d5ba46835a8ed37b47a499a9c44b9cd1574332d8ee1f1b7ba8"

RPROVIDES:${PN} += "qt6-base-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
