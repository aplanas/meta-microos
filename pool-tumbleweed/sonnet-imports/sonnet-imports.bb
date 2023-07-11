SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "sonnet-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "f33f33a5ddeff1a2d3c621e4ccba29367bfd06268fe33a3d6f848c2fe0a56c373659a197b001bb036923ab761bf9968cc376f0eb72f8d3acef4d5a289ac4c71c"

RPROVIDES:${PN} += "libsonnetquickplugin.so \
qt5qmlimport-org.kde.sonnet.1 \
sonnet-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libKF5SonnetCore5 \
libKF5SonnetUi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
