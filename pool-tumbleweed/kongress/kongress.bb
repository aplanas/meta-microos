SUMMARY = "Companion application for conferences"
DESCRIPTION = "Kongress provides practical information about conferences. \
It supports conferences that offer their schedule in iCalendar \
format. In Kongress, the data of the talks are shown in various \
ways, e.g. in daily views, by talk category, etc. The users can \
also create a list of favorite conference talks/events as well as \
they can navigate to the web page of each talk. A map of the \
conference venue, location information and link to OpenStreetMap \
can also be added."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kongress-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bef32c05809c74ff4c6176c6f86be149965462be4a64b21ccd3786d5796c861b59bcaffa565f48efe4f19b9e052e92cd334a1604f3f18543ca33c200665851b6"

RPROVIDES:${PN} += "application() \
application(org.kde.kongress.desktop) \
kongress \
kongress(aarch-64) \
metainfo() \
metainfo(org.kde.kongress.appdata.xml)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
