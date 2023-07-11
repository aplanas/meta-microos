SUMMARY = "QML modules for KDE games"
DESCRIPTION = "This package contains QML modules for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkdegames-qt5-imports-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "02d6ad9f7eab1fb4b41497674b0b262fb2609c4417610296ca2ca6648e1bdcf143a6508fcb21367b03ff65ec40acc2f31fdb4eebbc65ef94d9abf4cee56a6ee4"

RPROVIDES:${PN} += "libcorebindingsplugin.so \
libkdegames-qt5-imports \
qt5qmlimport-org.kde.games.core.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5KDEGames.so.7 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
