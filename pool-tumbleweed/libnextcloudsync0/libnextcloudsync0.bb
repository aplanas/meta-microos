SUMMARY = "The Nextcloud synchronisation library"
DESCRIPTION = "The Nextcloud Desktop Client synchronisation library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libnextcloudsync0-3.9.0-3.1.aarch64.rpm"
RPM_HASH = "91e3ca0f801db6a51c88ecf842917f52418ac3af72dd103e3a1c74600f4e497f115b0e7a969c6a4795ef78fe78cab137d73a9fc4e7667e34efacfb06033c7729"

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
