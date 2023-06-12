SUMMARY = "Documentation for qt6-charts in HTML format"
DESCRIPTION = "This package contains documentation for qt6-charts in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "94a4a8ab8e4c2db9cac6381338db08374bdcee204f31f2d79bba935c7ed3bbc160d893371fe285d199b6869d112fb12df3ed0c8a03ebcad7746ba9266dceaccc"

RPROVIDES:${PN} += "qt6-charts-docs-html \
qt6-charts-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
