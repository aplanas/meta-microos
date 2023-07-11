SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-1.1.0-1.33.aarch64.rpm"
RPM_HASH = "320531a99d8a09c7c2dff8ca4f612b101bc78b3fb275ceffc34f0fb4fc549851d716acd99409a8834a49a857a187fe940e358939466c6dda10568425e1e754e0"

RPROVIDES:${PN} += "kirigami \
libkirigamiplugin.so \
qt5qmlimport-org.kde.kirigami.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.1 \
qt5qmlimport-org.kde.plasma.core.2"

inherit rpm
