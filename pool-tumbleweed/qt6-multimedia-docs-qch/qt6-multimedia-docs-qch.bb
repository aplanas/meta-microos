SUMMARY = "Documentation for qt6-multimedia in QCH format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d72688b59f84b45394f823b89dec91c6659e814bd12f48b7179bdf52717374b51ee43d0da7e58a3fdcad147f5850b8adaf806e910a886b11204bd4941095f59d"

RPROVIDES:${PN} += "qt6-multimedia-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
