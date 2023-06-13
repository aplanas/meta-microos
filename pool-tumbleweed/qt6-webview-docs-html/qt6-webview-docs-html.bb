SUMMARY = "Documentation for qt6-webview in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webview in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webview-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "fbfdaae8451c814dae4587e375c14d3dffb51eae686d9eaf49b77329805e5e6a7732f3a490723bc8fbf0a9b53c072d807ec8bd5d618e71a2d9fddb0ef5bc821f"

RPROVIDES:${PN} += "qt6-webview-docs-html \
qt6-webview-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
