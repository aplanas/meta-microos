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

RPM_NAME = "leechcraft-bittorrent-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "3d166ebf4ac11ab8ebfddb6ffa11e60efdd74eac3fce9af1c196c1050f0a4a05475731f8cdaf9bb3657697ed75c70fef00862002ebca92197db6524ad8abbeb6"

RPROVIDES:${PN} += "application() \
application(leechcraft-bittorrent-qt5.desktop) \
leechcraft-bittorrent \
leechcraft-bittorrent(aarch-64) \
libleechcraft_bittorrent.so()(64bit) \
mimehandler(application/x-bittorrent) \
mimehandler(x-scheme-handler/magnet)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-shortcuts-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-tags-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmaxminddb.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libtorrent-rasterbar.so.2.0()(64bit)"

inherit rpm
