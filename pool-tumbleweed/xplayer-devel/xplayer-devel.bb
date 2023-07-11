SUMMARY = "Development files for xplayer media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation. \
 \
This package contains files for development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-devel-2.4.4-1.4.aarch64.rpm"
RPM_HASH = "309346020a6b796f51c18f0181e235ef3daf0c54fa1c5080ea6ae33d41f4496449379d6199810b0f3c3e28c8b901211c861c21950c8848f979f2d1fb4001bb7d"

RPROVIDES:${PN} += "pkgconfig-xplayer \
xplayer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-xplayer-plparser \
xplayer"

inherit rpm
