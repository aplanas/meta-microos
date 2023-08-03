SUMMARY = "Documentation for qt6-serialbus in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "13ff8d8352f86e0d3aaceca4a41fa82bbd7fe5e9a939f3759731f854fd61bf8982ec73ae5189faa433861b2dc612793bcfce89130159b667ec2cdf9d8ff6fb41"

RPROVIDES:${PN} += "qt6-serialbus-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
