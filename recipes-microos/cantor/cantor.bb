SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "cantor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dc535e42491f7e8fe3102838a9fa32f05c0c9398542934a84e9fe4a82968c99a4f96f82f7da63d8a8c8e90ffedfe7414830ff6c80e97b6430fdede18581cd255"

RPROVIDES:${PN} += "application() application(org.kde.cantor.desktop) cantor cantor(aarch-64) cantor5 libcantor_config.so()(64bit) metainfo() metainfo(org.kde.cantor.appdata.xml) mimehandler(application/x-cantor)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAnalitza.so.8()(64bit) libAnalitzaGui.so.8()(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Pty.so.5()(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Help.so.5()(64bit) libQt5Help.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcantorlibs.so.28()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libluajit-5.1.so.2()(64bit) libpython3.10.so.1.0()(64bit) libqalculate.so.22()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
