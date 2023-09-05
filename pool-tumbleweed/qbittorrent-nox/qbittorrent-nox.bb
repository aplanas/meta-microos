SUMMARY = "A BitTorrent client in Qt, CLI version"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. This subpackage contains a command-line \
version."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.5"

RPM_NAME = "qbittorrent-nox-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "95a92d01079e2a5abeb266053ecbb32b63882921f4258cc3e7a2cd72e85547cda3f9d324a03f1bd41d65160660ff41cfebb96a8b5f4d746a47400c9e18d394f3"

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
