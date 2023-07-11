SUMMARY = "LeechCraft BitTorrent client Module"
DESCRIPTION = "This package provides a BitTorrent client for Leechcraft. \
 \
Features: \
 * Support for DHT and magnet links \
 * Sequential download mode where torrent is download sequentially. \
 * Torrents queue, limiting number of seeding/leeching torrents. \
 * Ability to rename files and directories in the torrent. \
 * Selective download: possibility to select specific files from torrent. \
 * Continue downloads left by any other client. \
 * Support for sparse files. \
 * Tags for torrents. \
 * Global and per-torrent speed limits. \
 * Connection number limits. \
 * Fast resume support to avoid long startup times. \
 * IP filter to block/unblock unwanted peers. \
 * Support for extension protocol"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-bittorrent-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "249adc2f8e88ac92623ed1edcd7276078556400da3a4edf10ced9e4ed648264aca0a2489c3c02f5a22219de321c00f17c72488a7e13bfdf5a7f5f5345eff57d7"

RPROVIDES:${PN} += "leechcraft-bittorrent \
libleechcraft-bittorrent.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libm.so.6 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0"

inherit rpm
