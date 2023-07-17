SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "sonnet-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "fbc2d50bd7be35e203e1e1836f8c3814f7118bb2d82efbd5d5194749cb8936a817c083a59d9fcf3ee467fc59aab34a59d69a965425a37756e7891b7cdcdf4ed4"

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
