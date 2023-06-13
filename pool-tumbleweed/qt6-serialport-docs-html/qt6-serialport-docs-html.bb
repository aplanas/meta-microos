SUMMARY = "Documentation for qt6-serialport in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialport in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialport-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4fe34c6bf6ffc9d2aeb88780e47c5167e421b8108d16bd46e1e73abd244ec4af89d0e7392155a73c072b57580d11725665215dddb831c871f8e48c4c89b97846"

RPROVIDES:${PN} += "qt6-serialport-docs-html \
qt6-serialport-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
