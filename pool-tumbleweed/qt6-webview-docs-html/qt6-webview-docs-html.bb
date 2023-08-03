SUMMARY = "Documentation for qt6-webview in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webview in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webview-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4fade18a3e32a919839f3ea84a6ef78898d5c10715986a81cef07428052dbac45e75f6e232179f9ddd705b0263d7aee7f414f7d618552bc4b649ca0bb3e38429"

RPROVIDES:${PN} += "qt6-webview-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
