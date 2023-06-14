SUMMARY = "A spell checker library for GTK+ applications"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "gspell-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "23581d423194eefb9dc2500248e4591c8163e82fbf19e31143d1cee642f0bc33b49ffdc0992e51a426f59461e68a87554286c107abee97565ed8adf8eb803833"

RPROVIDES:${PN} += "gspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libicudata.so.73 \
libicuuc.so.73 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
