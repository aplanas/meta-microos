SUMMARY = "Documentation for qt6-grpc in QCH format"
DESCRIPTION = "This package contains documentation for qt6-grpc in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-grpc-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a0fba5ba8f84746a89e0ab420ad5ae3ccada034dca72f335233e23b0027514e56336e7609ddac2b88160faca3fece7d6c6f5543b7abca54b0bfd1fffed8c0c42"

RPROVIDES:${PN} += "qt6-grpc-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
