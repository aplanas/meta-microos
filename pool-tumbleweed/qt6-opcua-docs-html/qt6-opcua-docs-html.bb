SUMMARY = "Documentation for qt6-opcua in HTML format"
DESCRIPTION = "This package contains documentation for qt6-opcua in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d4dab1b1dd49baf36969edd87e75cdc6fec9de028d7cafe471023dbc2697f676f309d2abfe2372f3c47fe5070ac45253cb0a3efb455b4bb433a1cf02d2bb9b18"

RPROVIDES:${PN} += "qt6-opcua-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
