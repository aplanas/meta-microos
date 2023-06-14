SUMMARY = "Spell checker library for GTK+"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the shared libraries for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "libgspell-1-2-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "5980f3163ebf95cea0bc5e8db475d2c80dbc14782d12183631afff0b0073577486359cff984c5865ce96f4b377747cb68adb637006b234cd1f3d3542121451a5"

RPROVIDES:${PN} += "gspell \
libgspell-1-2 \
libgspell-1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libicuuc.so.73 \
libpango-1.0.so.0"

inherit rpm
