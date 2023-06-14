SUMMARY = "Notification Daemon"
DESCRIPTION = "D-BUS notification daemon."
LICENSE = "GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "notification-daemon-3.20.0-7.6.aarch64.rpm"
RPM_HASH = "f3df79ccc33f57226a88e181b43fe131dab1419da261ad4e56897aaa65cecfe19066ef077ba735f70ad99c8d6d4aa68107b17d2830b504c5ddd55984f2689c01"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
notification-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
