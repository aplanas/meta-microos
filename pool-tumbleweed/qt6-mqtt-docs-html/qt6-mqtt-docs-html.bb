SUMMARY = "Documentation for qt6-mqtt in HTML format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-mqtt-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b483710c920a2558413c6707e1f3b79e5a3ba65c9869f651a549172eceb3b0e16b92e125bb678f10a889fd0f3f45bd2397198eb6f81e710b1c88f0aea0b6cc16"

RPROVIDES:${PN} += "qt6-mqtt-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
