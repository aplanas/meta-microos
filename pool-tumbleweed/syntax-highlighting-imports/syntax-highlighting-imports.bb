SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "syntax-highlighting-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2d3284131b2de1da952d3cfd644ee2238d20d9b4f9e1d11f09ca1f1c8cff1677c4cd58fafdfa1f1b1c051cbd25ff5a5e345bf3441886a65df2071289f1b55480"

RPROVIDES:${PN} += "libkquicksyntaxhighlightingplugin.so()(64bit) \
qt5qmlimport(org.kde.syntaxhighlighting.1) \
syntax-highlighting-imports \
syntax-highlighting-imports(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5SyntaxHighlighting5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
