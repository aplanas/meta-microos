SUMMARY = "Software store for the KDE Plasma desktop"
DESCRIPTION = "Discover is a graphical software manager for the KDE Plasma desktop. It helps users to find software they might want easily and quickly. \
 \
By allowing to navigate a software library by search, categories, top lists along with detailed application information including screenshots and reviews, users can more quickly find applications that suit their needs."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "251f4f9a18cbdb351f8a67989b813db648b4cc13cbafd88955d79d0df5613dca77e33fcc283d0c045cde78179bebbd2eada91601c01b6d2387d4974ec2e0f00d"

RPROVIDES:${PN} += "application() application(org.kde.discover.desktop) application(org.kde.discover.urlhandler.desktop) discover discover(aarch-64) libDiscoverCommon.so()(64bit) libDiscoverNotifiers.so()(64bit) metainfo() metainfo(org.kde.discover.appdata.xml) mimehandler(application/vnd.flatpak) mimehandler(application/vnd.flatpak.ref) mimehandler(application/vnd.flatpak.repo) mimehandler(application/x-rpm) mimehandler(x-scheme-handler/appstream)"
RDEPENDS:${PN} += "kdeclarative-components kirigami2 kuserfeedback-imports ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAppStreamQt.so.2()(64bit) libKF5Attica.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5WebView.so.5()(64bit) libQt5WebView.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
