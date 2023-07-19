SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "ee6f77ce63ad71cb90e6f6a79ccec5461a813c1f1bd7cbdbe0752e9708b2232a262c3c12675a0c1fce4213455eadf531b19c63ba2aea8cd1475240e439e32880"

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
