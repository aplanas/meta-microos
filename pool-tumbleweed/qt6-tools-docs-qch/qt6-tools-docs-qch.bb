SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-qch-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "26e9990c13f5279fc0a859c4ca121a89dce4142b4d99c42adf4681f7c721885756136ab118813b7c1f890faa14c4c3b458cafe0998619bb01c206d2529c2676a"

RPROVIDES:${PN} += "qt6-tools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
