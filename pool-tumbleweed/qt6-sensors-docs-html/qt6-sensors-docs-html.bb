SUMMARY = "Documentation for qt6-sensors in HTML format"
DESCRIPTION = "This package contains documentation for qt6-sensors in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "37db2022df8a2de654a19b973b62f77a402b4f6a5a3725e7d8ab5aa4df195960d1969e5e2d6608c291fdb930f3ddb1f95ebc8f0e261dc28d4e54af1cfad9335f"

RPROVIDES:${PN} += "qt6-sensors-docs-html \
qt6-sensors-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
