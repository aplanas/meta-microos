SUMMARY = "Development files for libcmis-c"
DESCRIPTION = "Development files for libcmis-c. libcmis-c is a C client library for \
the CMIS interface."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-c-devel-0.5.2-1.25.aarch64.rpm"
RPM_HASH = "379d4433ddef8114790547095e3681fc4d654de206f0ef18ac431530b0f4234e7e45d69252f0f4086e69ecc30b1d148979b83e14f85af48f7857955a0321c197"

RPROVIDES:${PN} += "libcmis-c-devel \
pkgconfig-libcmis-c-0.5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-c-0-5-5 \
pkgconfig-libcmis-0.5 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
