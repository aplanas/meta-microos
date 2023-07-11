SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkcddb-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "69281018b6ae9ce09bc901f74317fec916b43b2c686832a8446e153a6ebfe4ea8a9e87d75cd777a2c6855c66a05b5385f3b67b3c6490c4296a141c61ac91150f"

RPROVIDES:${PN} += "libkcddb \
libkcddb16 \
libkcddb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Cddb.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
