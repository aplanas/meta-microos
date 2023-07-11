SUMMARY = "A BitTorrent client in Qt"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. \
 \
It has a streaming-like function to let users download and play video \
files, supports Unicode and has a bandwith scheduler."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.4"

RPM_NAME = "qbittorrent-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "a80c738b46cfd28c881218c26f89f8bf8e441a9f075fd51c1878762c31f6e44d1308a1d46232f7cdd5a2fc179221ce2ccc536ce228d0e05a5f7a52b7aee34dc5"

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
