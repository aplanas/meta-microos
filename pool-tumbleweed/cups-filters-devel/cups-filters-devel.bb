SUMMARY = "Development files for cups-filters"
DESCRIPTION = "This package contains the development files for cups-filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.15"

RPM_NAME = "cups-filters-devel-1.28.15-3.2.aarch64.rpm"
RPM_HASH = "e4d84497937335590a9cd699260b8e2354d5e376e890ad1199f40f1e6785e0ad5b16c3ef0b09cb551d13e03d8352ad1b100c4fd00dc1c38af46b3f1aca353e56"

RPROVIDES:${PN} += "cups-filters-devel \
pkgconfig-libcupsfilters \
pkgconfig-libfontembed"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-filters"

inherit rpm
