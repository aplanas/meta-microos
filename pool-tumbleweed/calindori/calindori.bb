SUMMARY = "Kirigami-based calendar application"
DESCRIPTION = "Calindori is a touch friendly calendar application. \
It has been designed for mobile devices but it can also run on desktop environments. \
Users of Calindori are able to check previous and future dates and manage tasks and events."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "calindori-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8dd5c83fd23a45afb9954ba2d9abf568e27da48ffaf7e6b007430f706163212a0b221cd7996d155b94b482b93bd073c94e77981bea34334b541940ba53d40e9f"

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
