SUMMARY = "Documentation for qt6-positioning in HTML format"
DESCRIPTION = "This package contains documentation for qt6-positioning in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f3b9c407ab94d8bd8cb84dc224bedf5624a95410a23cae003cc84f68c34c87650899c01184b77d8117cbadbd9a73c9759d9ed30bbd6432a8e86df33a46b40483"

RPROVIDES:${PN} += "qt6-location-docs-html \
qt6-positioning-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
