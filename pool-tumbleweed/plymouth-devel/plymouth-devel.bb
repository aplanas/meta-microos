SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "b0877f7ae037a1fec3664ec7e7402d5619d7f8f8c7359d2c766b4de1898a52355520a424fc9d0206e79d16cd5ee476c931c80c4a4b1f5fc6b721b8a324366b71"

RPROVIDES:${PN} += "pkgconfig-ply-boot-client \
pkgconfig-ply-splash-core \
pkgconfig-ply-splash-graphics \
plymouth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libply-boot-client5 \
libply-splash-core5 \
libply-splash-graphics5 \
libply5 \
pkgconfig \
pkgconfig-ply-splash-core \
plymouth"

inherit rpm
