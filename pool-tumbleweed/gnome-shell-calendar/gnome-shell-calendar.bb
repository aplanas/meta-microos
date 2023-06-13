SUMMARY = "Evolution Calendar support for GNOME Shell"
DESCRIPTION = "This package adds support for Evolution Calendar, such as appointments \
into GNOME Shell calendar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-calendar-44.1-1.1.aarch64.rpm"
RPM_HASH = "6c6af079e290f121d6e1b538b032dc070bbadeda2239461b931d90b04051f17f81028a1886766834780138b2c824d1b3b47ee96586d53a46e18c27651b320a72"

RPROVIDES:${PN} += "gnome-shell-calendar \
gnome-shell-calendar(aarch-64)"

RDEPENDS:${PN} += "evolution-data-server \
gnome-shell \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libical-glib.so.3()(64bit)"

inherit rpm
