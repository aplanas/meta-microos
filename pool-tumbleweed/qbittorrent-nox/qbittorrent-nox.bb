SUMMARY = "A BitTorrent client in Qt, CLI version"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. This subpackage contains a command-line \
version."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.4"

RPM_NAME = "qbittorrent-nox-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "00b3cbcda81e9875849ea8241760ddd05ab3f1f65312e9219857d6c04e09c1140a824f68ba616b27529b62e327fff80c30da35801953599135d6df9bf3a4485d"

RPROVIDES:${PN} += "qbittorrent-nox"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
libz.so.1 \
systemd"

inherit rpm
