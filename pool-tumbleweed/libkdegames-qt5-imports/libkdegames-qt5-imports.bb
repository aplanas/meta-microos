SUMMARY = "QML modules for KDE games"
DESCRIPTION = "This package contains QML modules for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkdegames-qt5-imports-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "929d2b2620db401c68357eb7cd9e6f7abe086c099282d6fd07e2def09e7be64f65ee26769ab9534f61ecf748cbbe3bbb582cf4ed9c7ab25c03b5e5628b3b4def"

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
