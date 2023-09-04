SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-base-docs-html-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e3a34310628553e829ee096f0a7107d85fb08af1abd84de3461c2b1e529022be5b6002412b412b8cf81abee45108b02fc598a8f1e0d1e80f0644246e6b62990e"

RPROVIDES:${PN} += "qt6-base-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
