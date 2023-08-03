SUMMARY = "Documentation for qt6-charts in QCH format"
DESCRIPTION = "This package contains documentation for qt6-charts in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5aed1aa72bceb547f6eae8aaee9b7a80aba4b49a7fbd6b2a5f505d0b5c7f278a5c9ac900fcc36e42e4a2bfa0e23b444338ae53cc1d211a0026e125f678cbe008"

RPROVIDES:${PN} += "qt6-charts-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
