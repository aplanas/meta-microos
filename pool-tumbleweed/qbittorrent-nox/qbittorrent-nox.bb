SUMMARY = "A BitTorrent client in Qt, CLI version"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. This subpackage contains a command-line \
version."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.3"

RPM_NAME = "qbittorrent-nox-4.5.3-1.1.aarch64.rpm"
RPM_HASH = "0338bec9884d348d67767c865f6ff020375a76868d8f26df5d4d962081cf7518bcb69a596f955a15f3b0a2f4f336d761739e53346b8b8d00e5a5642ef07be8d9"

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
