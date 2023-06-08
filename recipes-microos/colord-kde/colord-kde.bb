SUMMARY = "KDE interfaces and session daemon to colord"
DESCRIPTION = "Colord-kde provides KCM module and KDE daemon module for colord support."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "colord-kde-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a1d28fa255772aa64596005390f2566ef7229c1c33fa49505c120830dfc88e37c8b482b556d66bdf3bd0c9b04738e9d9dcee12f48289646c21cd365b693189a6"

RPROVIDES:${PN} += "application() application(colordkdeiccimporter.desktop) colord-kde colord-kde(aarch-64) mimehandler(application/vnd.iccprofile)"
RDEPENDS:${PN} += "colord ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kirigamiaddons.treeview.1) qt5qmlimport(org.kde.kitemmodels.1)"

inherit rpm
