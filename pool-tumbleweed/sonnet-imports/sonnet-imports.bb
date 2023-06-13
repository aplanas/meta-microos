SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "sonnet-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "67b188d4151757a7b65fd97f44e75bee5d0b905e913aada19e11bca5ae963d9dbab0ada25bfa50761731969c06893fa6211e192ef0f2e124b12965d705d4dbca"

RPROVIDES:${PN} += "libsonnetquickplugin.so()(64bit) \
qt5qmlimport(org.kde.sonnet.1) \
sonnet-imports \
sonnet-imports(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetCore5 \
libKF5SonnetUi5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
