SUMMARY = "QML modules for KDE games"
DESCRIPTION = "This package contains QML modules for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkdegames-qt5-imports-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3c1792394a7b0c863fb73fe4b2b53472b24026ab1424828cb8402480c678b9008314179027c5cd7a36c76940e58616aec523c34634e6c18a8067f021ed8bc6f4"

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
