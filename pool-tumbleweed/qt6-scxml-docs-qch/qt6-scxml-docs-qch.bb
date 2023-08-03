SUMMARY = "Documentation for qt6-scxml in QCH format"
DESCRIPTION = "This package contains documentation for qt6-scxml in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ad9efc9dbc678e2c9a8d85487a8c0d6dfada0931a4ca674d409c942f4e968179a319492793a38dc4ccd32d9e30b9126408a858811f5c76ddf9057896d8753ff8"

RPROVIDES:${PN} += "qt6-scxml-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
