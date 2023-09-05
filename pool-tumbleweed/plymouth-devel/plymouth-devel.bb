SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "4d56bf72ad7034a274f6455742bf37fe5657a6b57da8b49a73c479b1b03790c604a70233017f544c779bbb4462b3fe506d6be03376ca511066ca60ee1a1b5f86"

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
