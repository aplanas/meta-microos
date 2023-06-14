SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kirigami2-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "03cf04cdcc63388f3806e670718777d8d9af9ab0ba6758eacf19bd72dafbbe693702d14bafb2a6a68f9ece12fbd3f565376a9157e98faf15747fbc80eca94cc8"

RPROVIDES:${PN} += "kirigami2 \
libKirigamiPlugin.so \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigami.private.2 \
qt5qmlimport-org.kde.kirigami.templates.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Kirigami2.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigami.private.2 \
qt5qmlimport-org.kde.kirigami.templates.2"

inherit rpm
