SUMMARY = "A BitTorrent client in Qt"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. \
 \
It has a streaming-like function to let users download and play video \
files, supports Unicode and has a bandwith scheduler."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.5"

RPM_NAME = "qbittorrent-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "33c83d2a2f22428ced9e921b5c7316d3abcbd9b09570cbcb257ba73a18d63d1e124537f20e3d88f25183cd6b758b2e24fc95717b62a75cc5dbcda561b4b0260a"

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
