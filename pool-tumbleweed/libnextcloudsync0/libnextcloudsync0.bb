SUMMARY = "The Nextcloud synchronisation library"
DESCRIPTION = "The Nextcloud Desktop Client synchronisation library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "libnextcloudsync0-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "fa37d8b77399883978427ab39cb6a30100c040641fff93d83664a8eb8a7a777374707f34fb3b70f867908c180c832b7ffe0b094bc286063e9cffab90aa82fb2d"

RPROVIDES:${PN} += "libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
