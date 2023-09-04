SUMMARY = "Spell checker library for GTK+"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the shared libraries for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgspell-1-2-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "6e935015d4bc1193d833a6e2e6187c668f5a522c6871ed71fd87dcc3dca474549c6d3031881e1579a7619fe612b25138d580197536f246a6d547ec907be8eca4"

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
