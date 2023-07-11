SUMMARY = "Development files for the Osmocom MTP library"
DESCRIPTION = "MTP is part of SS7 used for communication in Public Switched \
Telephone Networks. \
 \
This subpackage contains the development files for the Osmocom MTP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-mtp-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "62b406a1c7a30f3311a0776680b689a0e10193419bc2b486f16d8d84b13d01995f86e8a5d49e430c4460261d9435582a348320a1969fde6a7081178123a56456"

RPROVIDES:${PN} += "libosmo-mtp-devel \
pkgconfig-libosmo-mtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mtp-1-7-0"

inherit rpm
