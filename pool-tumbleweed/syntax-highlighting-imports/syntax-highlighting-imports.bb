SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.107.0"

RPM_NAME = "syntax-highlighting-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "006944d408637d54bc8ec04a7e43f34da4e57c820a2429bf775dfb54e23a45390391c265b11c5ecbe6f68876a5c43776bb27471bc7dd2457a499c1c8649bf616"

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
