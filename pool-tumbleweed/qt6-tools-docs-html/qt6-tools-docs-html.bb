SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "22d59ad0709f06192a3976f386bd488bf0b3e89fe14bc75265b1156a4d97e81a820388e5bb861e3ded07304060dd0446303c828eb9976818ebb3a0ac073b2894"

RPROVIDES:${PN} += "qt6-tools-docs-html \
qt6-tools-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
