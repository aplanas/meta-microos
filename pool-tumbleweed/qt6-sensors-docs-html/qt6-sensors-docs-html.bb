SUMMARY = "Documentation for qt6-sensors in HTML format"
DESCRIPTION = "This package contains documentation for qt6-sensors in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dcc777d817d4ed7f489534c283be82a73ec95a5d6476dfccb18ac2ee60bb425459ee806820cd8e01f5b3e9ae246bdcd4e9150afea9f7da4995142d23d4c6ccce"

RPROVIDES:${PN} += "qt6-sensors-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
