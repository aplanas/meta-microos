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

RPROVIDES:${PN} += "application() \
application(org.qbittorrent.qBittorrent.desktop) \
metainfo() \
metainfo(org.qbittorrent.qBittorrent.appdata.xml) \
mimehandler(application/x-bittorrent) \
mimehandler(x-scheme-handler/magnet) \
qbittorrent \
qbittorrent(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Svg6 \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtorrent-rasterbar.so.2.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
