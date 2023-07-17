SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7b364b8d82c38ab5c0a8491e59aefd8f0c30c4bd74e495a5cdc26c64c4011f55e0c110425551548bd174aee523946a38792d60dd94e8c802be6ff804a65c90c9"

RPROVIDES:${PN} += "qt6-webengine-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
