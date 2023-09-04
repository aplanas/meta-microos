SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.109.0"

RPM_NAME = "syntax-highlighting-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9ff512f5c5ed59ef04918a0e318ff50044256783e3f89cec22601f6296c0f9dfded99427c718ba46fb504eefd6b14de62e6ded10f06b7a00a29c51121096216f"

RPROVIDES:${PN} += "libkquicksyntaxhighlightingplugin.so \
qt5qmlimport-org.kde.syntaxhighlighting.1 \
syntax-highlighting-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libKF5SyntaxHighlighting5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
