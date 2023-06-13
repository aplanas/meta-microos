SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-1.1.0-1.32.aarch64.rpm"
RPM_HASH = "6573522e0771f14d3f415eba77cc1294e1d39583413cbb8c1e00b9570a204e481355cdf21ca2278582045cd85e97f9320c789469f6831d1295faed6a0f68771d"

RPROVIDES:${PN} += "kirigami \
kirigami(aarch-64) \
libkirigamiplugin.so()(64bit) \
qt5qmlimport(org.kde.kirigami.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Private.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.kirigami.1) \
qt5qmlimport(org.kde.plasma.core.2)"

inherit rpm
