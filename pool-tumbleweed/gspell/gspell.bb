SUMMARY = "A spell checker library for GTK+ applications"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "gspell-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "ccd64c194fbf6f3bd03047512311c3d5ebc165de00be955337946fbfa573ea409e199a074c2a5e09fabe42c4abebf99f8e5d763295ddb9fc7389bb2485b3f846"

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
