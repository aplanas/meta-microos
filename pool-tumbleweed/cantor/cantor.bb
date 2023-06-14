SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "cantor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dc535e42491f7e8fe3102838a9fa32f05c0c9398542934a84e9fe4a82968c99a4f96f82f7da63d8a8c8e90ffedfe7414830ff6c80e97b6430fdede18581cd255"

RPROVIDES:${PN} += "cantor \
cantor5 \
libcantor-config.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libAnalitza.so.8 \
libAnalitzaGui.so.8 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Pty.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libR.so \
libc.so.6 \
libcantorlibs.so.28 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libpython3.10.so.1.0 \
libqalculate.so.22 \
libstdc++.so.6"

inherit rpm
