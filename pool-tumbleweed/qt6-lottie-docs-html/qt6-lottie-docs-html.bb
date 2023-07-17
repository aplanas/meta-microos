SUMMARY = "Documentation for qt6-lottie in HTML format"
DESCRIPTION = "This package contains documentation for qt6-lottie in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4d6123267636d104ebc64dd160ad729661e9c2c72f117ddabfe3b0fac343e4b89e35e8364fec1da0caa1b7279a8a35d3d7a5846bee736daa6588ceea9fd6011c"

RPROVIDES:${PN} += "qt6-lottie-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
