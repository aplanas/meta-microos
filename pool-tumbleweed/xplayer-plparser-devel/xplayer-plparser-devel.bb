SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xplayer-plparser-devel-1.0.2-2.13.aarch64.rpm"
RPM_HASH = "d096cf746dab95d137d2664585d62f738fe07b08ab6b84ceaaed41b4d3c492fec5b18ec7b727f7e46c375b167b078bb2e35f3d3511caa20e45b867d121d933df"

RPROVIDES:${PN} += "pkgconfig-xplayer-plparser \
pkgconfig-xplayer-plparser-mini \
xplayer-plparser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxplayer-plparser-mini18 \
libxplayer-plparser18 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmime-3.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-XplayerPlParser-1-0"

inherit rpm
