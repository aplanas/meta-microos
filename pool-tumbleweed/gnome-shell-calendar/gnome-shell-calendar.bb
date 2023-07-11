SUMMARY = "Evolution Calendar support for GNOME Shell"
DESCRIPTION = "This package adds support for Evolution Calendar, such as appointments \
into GNOME Shell calendar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-calendar-44.2-1.1.aarch64.rpm"
RPM_HASH = "b21c06e87e93cac259888bb26200ec48e7f2fbaf3a1c49d8f92e0f8a0b4b7be902d4bf49c5c2810d05bb7252ea8bb33bddcd0e5f2a8cc9332ecb0a1c75ebcb56"

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
