SUMMARY = "Mobile web browser"
DESCRIPTION = "Angelfish is a mobile web browser. It supports typical browser features, such \
as bookmarks, history and tabs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "angelfish-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c9ba97b3f8da5fa027af84570604377837583085492ccdca6ba34fd118b13319869972b59c8547d1088d7ff9e2a1b664dc437e4379032ba7de4ac8ecdd21d6fe"

RPROVIDES:${PN} += "angelfish angelfish(aarch-64) application() application(org.kde.angelfish.desktop) metainfo() metainfo(org.kde.angelfish.metainfo.xml) mimehandler(text/html) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5WebEngine.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit)"

inherit rpm
