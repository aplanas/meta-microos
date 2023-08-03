SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1cbb4e82fcdee31a332a9c647933959057e11c42b22e6447fd6a68fca9ccbfbcc7d35d054c3f7136cc3e0ada18ae48ead833c3417e208b4950f316843b069d43"

RPROVIDES:${PN} += "qt6-webengine-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
