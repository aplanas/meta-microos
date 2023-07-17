SUMMARY = "Documentation for qt6-positioning in HTML format"
DESCRIPTION = "This package contains documentation for qt6-positioning in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "da997f6b5198e6acbffe79479fd14be2056178b9d975be370ae24d09de03ea3b5d2f787ecb8272be8c2aa91e66bdc6e26e8faaed42b35b450daf30f2d37f304b"

RPROVIDES:${PN} += "qt6-location-docs-html \
qt6-positioning-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
