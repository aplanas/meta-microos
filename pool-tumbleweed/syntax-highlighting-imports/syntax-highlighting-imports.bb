SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.108.0"

RPM_NAME = "syntax-highlighting-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1c073eb73eec555bd99fd52752c393e8d1ab4de2ad1bedc5e68acc9378a9ab774bc4614e061a44cf1a9b9d194f70b08bb529f8237df7ae7302c981fdd983ff9d"

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
