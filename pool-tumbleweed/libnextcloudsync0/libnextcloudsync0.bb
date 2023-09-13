SUMMARY = "The Nextcloud synchronisation library"
DESCRIPTION = "The Nextcloud Desktop Client synchronisation library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "libnextcloudsync0-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "d52a2b7188e746ba336b67ce2ddc3959271bb05d90618f27cf7c0e7efa167c10abd10ab94a37257b14f00a8a546ba0ba572bcd153e72fbf55313b5692c2c55d0"

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
libQt5Xml.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
