SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kirigami2-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "262874e1c38e80efc091c1073344a9d0aa9189bc570f95220606258c004df2d942f101211e8dc778523c99fe9437f0f2135eed15a9fdcc2638b5a19245676197"

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
