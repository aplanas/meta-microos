SUMMARY = "Documentation for qt6-imageformats in HTML format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-imageformats-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d89b8acbb20baa31ce2cd8cddd73a0f24ebed357429696a8edd408e4c761610c49482485aef5736e3975d1b71d161d56a6ab59548cd04e34e1ca0e6ea4fc35c9"

RPROVIDES:${PN} += "qt6-imageformats-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
