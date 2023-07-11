SUMMARY = "Theme rendering library for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains a library to render themes."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "libmetacity3-3.46.1-1.2.aarch64.rpm"
RPM_HASH = "01e0ad87c47fd22b984e8d0b5d86b2d5f548627870adb6b89597481a71201143b6c4f006797ea38fb1db68fa5716530b3a473af0d938816c58f6402613669422"

RPROVIDES:${PN} += "libmetacity.so.3 \
libmetacity3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
