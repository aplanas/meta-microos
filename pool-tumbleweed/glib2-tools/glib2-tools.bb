SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "glib2-tools-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "6e75ec914a6b9b307abf7fcdb21dfc3770bb187163772625db9c5e97cd789704d01e07474dbc8fbd9ef11d62ae4c41b21c5328f9f3bccd2def859caf1c91190b"

RPROVIDES:${PN} += "glib2-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libgio-2-0-0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
