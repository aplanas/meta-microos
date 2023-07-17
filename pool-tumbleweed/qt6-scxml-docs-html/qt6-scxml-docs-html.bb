SUMMARY = "Documentation for qt6-scxml in HTML format"
DESCRIPTION = "This package contains documentation for qt6-scxml in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8e4d893fe8a144e280cbb48d04ce58e716696af04a2fd205f194c1b4a6166d6eb6d2c43cb7168d6f26649c27f11a3f2ad83547faf266d86b6402c47f49fbdb64"

RPROVIDES:${PN} += "qt6-scxml-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
