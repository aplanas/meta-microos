SUMMARY = "Documentation for qt6-mqtt in QCH format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-mqtt-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b7e425960d7a7b5c20ba2157da67d77f049a616a29cf78a2778a698d19bbb0b018ee9367d40d2421c54b5782c29fde54e61df18085fc9883083d7ce3bec4fddb"

RPROVIDES:${PN} += "qt6-mqtt-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
