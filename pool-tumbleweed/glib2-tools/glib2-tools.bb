SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-tools-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "5fc7701dd59f9ba673e60123e661c89a4d7b6fae20027a70790573f08b394e78917c6fd7a4b6e1863f74e6afe9096b891ad9c9c60f052758e29853d9108cc83c"

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
