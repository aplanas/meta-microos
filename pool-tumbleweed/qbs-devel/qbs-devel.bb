SUMMARY = "Development files for qbs"
DESCRIPTION = "This package is required to develop applications using qbs as a library"
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qbs-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "3666c27b17efe6dea78c31378b25ce782047f89fb0ddb1f7553d9dcfbd1ce4809180f2a55a9fe9244b6e1ea284fce42d55e6d2feda418694db29a9a51b3bee15"

RPROVIDES:${PN} += "qbs-devel"

RDEPENDS:${PN} += "qbs"

inherit rpm
