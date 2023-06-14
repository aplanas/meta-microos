SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "664f6da5b42df6f0c03b2b977dafaef7bf6c621dfa9c461ac4b6754cef2d5cbf7012b07b0482b00d9b3278cf60b0a84df38d331c7b8728b0f048224b4f87a72d"

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
