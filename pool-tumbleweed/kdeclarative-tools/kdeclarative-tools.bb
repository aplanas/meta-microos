SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdeclarative-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0d8dbf75db7f0abae90f2b611f107d324c5eb29fb5ef2c3b389246ac693b732cbb70b9ca06260728df66c93debd8c02b44d6197ed2609a8d313c08c130fcf2c8"

RPROVIDES:${PN} += "kdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
