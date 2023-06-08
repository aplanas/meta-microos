SUMMARY = "Deepin Manual"
DESCRIPTION = "Deepin Manual is designed to help users learn the operating system and its \
applications, providing specific instructions and function descriptions."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.12"

RPM_NAME = "deepin-manual-5.8.12-1.9.aarch64.rpm"
RPM_HASH = "d129d7ce711493c5364bd3a4ccce1f632bea6fd3b6eeba61e572252cba90872a1ef635d4a7582c2d07e24d97209c5490991a8e4817dbf03ef58fb4d4ab065248"

RPROVIDES:${PN} += "application() application(deepin-manual.desktop) deepin-manual deepin-manual(aarch-64) mimehandler(x-scheme-handler/dman)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
