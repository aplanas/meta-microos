SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2eff4e7f74f68ba5baf51d5aa0f9699b837fc9ee904b397b1694f3d6fb49a8c9b2dff5c82408add9bb5d78f003d352a84afdc9e37c00df3a4f90470d33e6264f"

RPROVIDES:${PN} += "qt6-base-docs-html \
qt6-base-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
