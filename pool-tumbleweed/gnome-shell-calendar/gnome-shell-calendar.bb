SUMMARY = "Evolution Calendar support for GNOME Shell"
DESCRIPTION = "This package adds support for Evolution Calendar, such as appointments \
into GNOME Shell calendar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-shell-calendar-44.3-1.1.aarch64.rpm"
RPM_HASH = "dfe2d065fe3c1e85e30017cc599fa5f04ba598269b6edd1deda2b084f2481ce79aa459eb21744f794e214cc9aabfc18ddb1f1d2737378eb9676c878caafce5d8"

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
