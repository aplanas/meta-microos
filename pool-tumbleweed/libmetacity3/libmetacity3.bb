SUMMARY = "Theme rendering library for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains a library to render themes."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "libmetacity3-3.46.1-1.1.aarch64.rpm"
RPM_HASH = "600446545eab5938165c0c4450f3c9ac6e226a129c9088dc0c92e6a67576ae5b8f7e9d1dd7c1b25f88189605f6415b97ed832ad4de9d2bc4766e3e145b3ad7f0"

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
