SUMMARY = "Development files for xplayer media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation. \
 \
This package contains files for development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-devel-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "4e706dc9990106570ec1a4b522a4af8cf1a39a6a37f0b3ceef088196455a549d54dbe486c4957b61963cf2d941646a591e596b0a202f54365d199b2bb6018ba9"

RPROVIDES:${PN} += "pkgconfig(xplayer) \
xplayer-devel \
xplayer-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(xplayer-plparser) \
xplayer"

inherit rpm
