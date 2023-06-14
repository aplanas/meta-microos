SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_nss_idmap-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "62066842ae7d041ae6f37d2b8fcde6aecbb6b171d72fece483f3ce057656a0f659becc7e214139f7d2dd33d0d229479c4abd3e559f06b54176503d9cdcbab587"

RPROVIDES:${PN} += "libsss-nss-idmap-devel \
pkgconfig-sss-nss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-nss-idmap0"

inherit rpm
