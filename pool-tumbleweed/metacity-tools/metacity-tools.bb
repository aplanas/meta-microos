SUMMARY = "Tools for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains tools related to metacity, including an \
utility to test themes and a small application to test window \
managers."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-tools-3.46.1-1.2.aarch64.rpm"
RPM_HASH = "904a7dc7bbda9890bb7390d6b00b60e1a87f2a1835f31c6ab9fe5faaef8df23e30e2da29e259874a4ac726e7863cb12b566452b01ba3ac50f734650f3799063b"

RPROVIDES:${PN} += "metacity-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libm.so.6 \
libmetacity.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1 \
metacity"

inherit rpm
