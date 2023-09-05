SUMMARY = "Torrent Downloading Library"
DESCRIPTION = "libktorrent is a torrent downloading library."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5Torrent6-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "26f9747cf3bb5173e054603bd845bd8686c1491b5e2c8af36b10d4005b3e5bc210ed3c412f80fc61e681ff8e7b10e968d9ff07fe05979fefdeee1b17d4bf74a3"

RPROVIDES:${PN} += "libKF5Torrent.so.6 \
libKF5Torrent6 \
libktorrent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgmp.so.10 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
