SUMMARY = "Documentation for qt6-datavis3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cfbd9e57abc313a7c309517c650261cff3390c42a4464459fa4106368b82e0a54b236176b471cace1873023ccb9d8f00a907dcba609850f557ab7d9068dbde7b"

RPROVIDES:${PN} += "qt6-datavis3d-docs-html \
qt6-datavis3d-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
