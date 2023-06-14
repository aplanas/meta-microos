SUMMARY = "Kirigami-based calendar application"
DESCRIPTION = "Calindori is a touch friendly calendar application. \
It has been designed for mobile devices but it can also run on desktop environments. \
Users of Calindori are able to check previous and future dates and manage tasks and events."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "calindori-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d53d94fd8dd205c914cc2b0ea791aabc013aac57a8087df9bfc036a1212ea3577d721a4d5822bd1d9a878155592d9f4bd8d852242c01ec60489749b9a529400d"

RPROVIDES:${PN} += "calindori"

RDEPENDS:${PN} += "kirigami2 \
kpeoplevcard \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5People.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
