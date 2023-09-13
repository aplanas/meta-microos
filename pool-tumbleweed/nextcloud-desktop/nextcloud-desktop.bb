SUMMARY = "Nextcloud desktop synchronisation client"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
Nextcloud Desktop enables you to connect to your private \
Nextcloud Server. With it you can create directories in your home \
directory, and keep the contents of those directories synced with \
the server. Simply copy a file into the directory and the desktop \
synchronisation client does the rest."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nextcloud-desktop-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "c183c95cdf015504e0d5786598227a6a197f026b22e3e0e9679235be914e650cd3b31de7b98de9cf4ae1479e4e541680a8e6f980291506b0ad5183cc805a8f62"

RPROVIDES:${PN} += "nextcloud-client \
nextcloud-client-lang \
nextcloud-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcloudproviders.so.0 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libqt5keychain.so.1 \
libstdc++.so.6 \
nextcloud-cli"

inherit rpm
