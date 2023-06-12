SUMMARY = "Documentation for qt6-connectivity in HTML format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "288899c10957d242fd4fef1e3f5497a31be9de5360bc4e65478c1667ea217ba1afd30d56d95f4f74b9055b4dd7c777412d1a3016743583c4c9cc5897d3b747ce"

RPROVIDES:${PN} += "qt6-connectivity-docs-html \
qt6-connectivity-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
