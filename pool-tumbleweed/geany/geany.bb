SUMMARY = "GTK-based integrated development environment"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment. It can do syntax highlighting \
for many formats, case folding, symbol name autocompletion, autoclose \
XML/HTML tags, provides code navigation and has a plugin interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-1.38-3.8.aarch64.rpm"
RPM_HASH = "f3eb1e4a73396974efa5a6eaeb2a7f2a9193d4a7f09b9f3054908acdcb30a99b55e2d6bcbef84f88c4cb79b4675ce52f1c99c5593bc6d558209d26a89fdf586e"

RPROVIDES:${PN} += "geany"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgeany.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
