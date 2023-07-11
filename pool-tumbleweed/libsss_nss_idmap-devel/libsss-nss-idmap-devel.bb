SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_nss_idmap-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "326331bda57726b3a1436f1afdd743c82120b2918127a6a9e18e2745d44d873f4e5826193383afbafa8a642d5ec4207854445ff3274ba4ffd25bb20e442cd06e"

RPROVIDES:${PN} += "libsss-nss-idmap-devel \
pkgconfig-sss-nss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-nss-idmap0"

inherit rpm
