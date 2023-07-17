SUMMARY = "Documentation for qt6-datavis3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d442aa7cc6be05321d26d5371f890139ecb1bd8b873de5345d23ef38977163fef78b73b03ca70b36b376363ef41f2ff53dcebd8590e959c0bec75f94be8d705b"

RPROVIDES:${PN} += "qt6-datavis3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
