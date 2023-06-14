SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "syntax-highlighting-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2d3284131b2de1da952d3cfd644ee2238d20d9b4f9e1d11f09ca1f1c8cff1677c4cd58fafdfa1f1b1c051cbd25ff5a5e345bf3441886a65df2071289f1b55480"

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
