SUMMARY = "A BitTorrent client in Qt"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. \
 \
It has a streaming-like function to let users download and play video \
files, supports Unicode and has a bandwith scheduler."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.3"

RPM_NAME = "qbittorrent-4.5.3-1.1.aarch64.rpm"
RPM_HASH = "e63f843939add5d7aaf726434b138ebb1d2d2289e2f9f76767300f01ea11f2ea698b820b50d51c5f0443e94ef95312046e23617da1ef1749b27a035cf01a2faf"

RPROVIDES:${PN} += "qbittorrent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
libz.so.1"

inherit rpm
