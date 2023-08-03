SUMMARY = "Documentation for qt6-serialport in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialport in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialport-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2d50cb97875de9414d5b255657a7ad87296ed4ebd560663987caaed69b2cdbb73c83aa90b91a7bea17c19eca5fcf261be71b70b1d42fddedca578035558cfd39"

RPROVIDES:${PN} += "qt6-serialport-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
