SUMMARY = "Documentation for qt6-serialbus in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "10c5d37f3dc0da268590ed46202a7deaa8bc0f78cd1aeff20e7f4152d4103d9415c1c64d535e05a2e24d8748cda29d2d7617558831c386b75219d14b1a50f253"

RPROVIDES:${PN} += "qt6-serialbus-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
