SUMMARY = "Development package for ibus-table"
DESCRIPTION = "This package contains the files required for the development of ibus-table."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.1"

RPM_NAME = "ibus-table-devel-1.17.1-1.1.aarch64.rpm"
RPM_HASH = "f6405ad607f66dbd71b758359da271f806b6c902ee7ef676fe26facb838f2bedf3e90d3572e96f47bcda2a98fbb3d8ac59bf5f0505d7f7abc0b1f49c84900dc3"

RPROVIDES:${PN} += "ibus-table-devel \
pkgconfig-ibus-table"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table"

inherit rpm
