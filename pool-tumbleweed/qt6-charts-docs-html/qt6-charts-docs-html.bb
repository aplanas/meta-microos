SUMMARY = "Documentation for qt6-charts in HTML format"
DESCRIPTION = "This package contains documentation for qt6-charts in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "13f9ac02abf938f7c627b85cd5f04dc9d03d9845e0e4546dd4c61da72d130f0dfceccd7356323ed506a9e9d1090d5973c07825ddd0a4cef593cf748508355907"

RPROVIDES:${PN} += "qt6-charts-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
