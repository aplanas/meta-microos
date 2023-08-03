SUMMARY = "Documentation for qt6-opcua in HTML format"
DESCRIPTION = "This package contains documentation for qt6-opcua in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "19336a91a7f1a714872031f00c4979df6c192a1c3f9b3930a9d4cddce54f8f228bd7bcb185141d0fd38bf472bbca44b6421ba150d7946167739dd1a955ab64bb"

RPROVIDES:${PN} += "qt6-opcua-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
