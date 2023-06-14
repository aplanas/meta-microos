SUMMARY = "Documentation for qt6-3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-3d-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "28aa935a4309f941e38993978362cff35f5bf6dfeec010f718544443a4932fab0c17b297f9f13359f13e53988757f34fba29d1460b7376e07074890ca267acb5"

RPROVIDES:${PN} += "qt6-3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
