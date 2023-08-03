SUMMARY = "Documentation for qt6-networkauth in HTML format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-networkauth-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b3d25dfe83bb85f78f708625b48415625a58511227367fc345a9817ca9105f9eff14f1c8db33858bfce53438ca3f1efa025a63d93f8f63da4680926d382fb807"

RPROVIDES:${PN} += "qt6-networkauth-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
