SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "sonnet-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "572760120192540edfb7a61c4f3eb318eafb401fa4f79a7eeb1f06fe91e3a85939dafee1f3c94bbf2d3d059b155dc99d126d78c22c281c08ae1f58a337afae76"

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
