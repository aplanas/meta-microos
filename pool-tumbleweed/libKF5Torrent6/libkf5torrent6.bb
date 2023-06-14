SUMMARY = "Torrent Downloading Library"
DESCRIPTION = "libktorrent is a torrent downloading library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5Torrent6-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8f22ec833db59b41cfbe547e51faad6b672a76af51ae69351e59de5e35ca4ac8bf10de6df3919bc3e2b68b9ebd53129aae50e1821a1858efe3e377d6afebff37"

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
