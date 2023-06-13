SUMMARY = "Notification Daemon"
DESCRIPTION = "D-BUS notification daemon."
LICENSE = "GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "notification-daemon-3.20.0-7.6.aarch64.rpm"
RPM_HASH = "f3df79ccc33f57226a88e181b43fe131dab1419da261ad4e56897aaa65cecfe19066ef077ba735f70ad99c8d6d4aa68107b17d2830b504c5ddd55984f2689c01"

RPROVIDES:${PN} += "application() \
application(notification-daemon.desktop) \
dbus(org.freedesktop.Notifications) \
notification-daemon \
notification-daemon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
