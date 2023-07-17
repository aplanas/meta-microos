SUMMARY = "Documentation for qt6-webview in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webview in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webview-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "843c01faca37598a1bb17286185c89425e0c9a097c4403aa17b8fd3b22fb290a136423e1224d40c8f13d95e98c9ce0e54ea3b73eed562c9e7fb80c55722071c8"

RPROVIDES:${PN} += "qt6-webview-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
