SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-docs-html-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "82ead432b76f12708552bb413c337d2dcb98bbe0f97aa9067e2bf1d7282ff072ee7027b6ecd5f2966aae335064ce21458dc43711c040b242038734c62a96ea6d"

RPROVIDES:${PN} += "qt6-webengine-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
