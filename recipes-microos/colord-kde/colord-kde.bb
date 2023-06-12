SUMMARY = "KDE interfaces and session daemon to colord"
DESCRIPTION = "Colord-kde provides KCM module and KDE daemon module for colord support."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "colord-kde-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e190033548b64edf21b6fc1cbc613f65839e83d6d0159d4a469c9f726ec8cf0ed52e14e7e35cad22403c0cdca67b9de85d11e5c8d53d5da65fdaaea58b5ae66c"

RPROVIDES:${PN} += "application() application(colordkdeiccimporter.desktop) colord-kde colord-kde(aarch-64) mimehandler(application/vnd.iccprofile)"
RDEPENDS:${PN} += "colord ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kirigamiaddons.treeview.1) qt5qmlimport(org.kde.kitemmodels.1)"

inherit rpm
