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

PV = "23.08.0"

RPM_NAME = "kongress-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6095863783ab20998c9a316d2cbd7c6cf04e45eee3c990c5a60667d8338ab4d64a12147a9776443c5b0a13ac8ab8163dc1d084af417ae0fdbd535cc8e877e82b"

RPROVIDES:${PN} += "kongress"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
