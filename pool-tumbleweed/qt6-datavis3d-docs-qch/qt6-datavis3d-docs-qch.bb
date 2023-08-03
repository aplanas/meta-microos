SUMMARY = "Documentation for qt6-datavis3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavis3d-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c63f5ffb02150b30c9fff1280f8dfd88e92251cebb00ee596faade80ae70b499058fa6af0776174ff3abd79c6be9174e580ea57894f3c9e95e4da7d06d9ee25c"

RPROVIDES:${PN} += "qt6-datavis3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
