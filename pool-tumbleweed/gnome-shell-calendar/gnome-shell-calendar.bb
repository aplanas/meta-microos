SUMMARY = "Evolution Calendar support for GNOME Shell"
DESCRIPTION = "This package adds support for Evolution Calendar, such as appointments \
into GNOME Shell calendar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-shell-calendar-44.4-1.1.aarch64.rpm"
RPM_HASH = "6f6b457baaaee2ba9257bae575ee7cc62df59f7fd86487c36e577ce5cba205a4225bd220e8fe9dd868150518813cc4c2d2f66718b381e57d451f1026b872fd23"

RPROVIDES:${PN} += "gnome-shell-calendar"

RDEPENDS:${PN} += "evolution-data-server \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3"

inherit rpm
