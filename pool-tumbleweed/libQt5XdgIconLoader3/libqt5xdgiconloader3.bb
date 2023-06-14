SUMMARY = "IconLoader library for QtXDG"
DESCRIPTION = "QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5XdgIconLoader3-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "80c2d6da47eec02d37c2f1d070ae694c1a1024a6942e2d8f465c4f8313c9add8c675042895123d6a4474cdc3e7fb657ca8d3653d0f5ff960853514e6fa9458fa"

RPROVIDES:${PN} += "libQt5XdgIconLoader.so.3 \
libQt5XdgIconLoader3 \
libqtxdgiconloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
