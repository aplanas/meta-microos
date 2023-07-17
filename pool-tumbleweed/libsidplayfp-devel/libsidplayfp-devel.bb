SUMMARY = "Development files for libsidplayfp"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libsidplayfp."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "libsidplayfp-devel-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "140b0f195e9d1011eaea3f7cc4639c06974bf4e2bceed2b46c1f4873238dc542802601928bcad620583835499471c016b9cf03fc55363368ed77b572efcc6894"

RPROVIDES:${PN} += "libsidplayfp-devel \
pkgconfig-libsidplayfp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsidplayfp6"

inherit rpm
