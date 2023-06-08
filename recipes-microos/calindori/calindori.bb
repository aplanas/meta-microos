SUMMARY = "Kirigami-based calendar application"
DESCRIPTION = "Calindori is a touch friendly calendar application. \
It has been designed for mobile devices but it can also run on desktop environments. \
Users of Calindori are able to check previous and future dates and manage tasks and events."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "calindori-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d0b80b02eb47583aa7003a587bdc96570e285bb658cf8a84378f81e98df98e9fc97a8a39399a823541d86d9c9a5b53cd8325a510b509be2cc498c3fb88321827"

RPROVIDES:${PN} += "application() application(org.kde.calindori.desktop) calindori calindori(aarch-64) metainfo() metainfo(org.kde.calindori.appdata.xml) mimehandler(text/calendar)"
RDEPENDS:${PN} += "kirigami2 kpeoplevcard ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5People.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
