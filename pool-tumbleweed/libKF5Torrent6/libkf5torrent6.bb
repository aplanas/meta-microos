SUMMARY = "Torrent Downloading Library"
DESCRIPTION = "libktorrent is a torrent downloading library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5Torrent6-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b95593e2e7776e8b06a3a38beb5fb51765e61256df2e6401ade1f3e4a3c07a076bf63e18724382d730afcccf0e620493d7a8d9a34bd80389bbd1fc752ae1b013"

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
