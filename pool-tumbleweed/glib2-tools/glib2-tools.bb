SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "glib2-tools-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "d7ea6ac699dca83bdd0d97291820a4162760b9a75b58a977cfdb009692f00ed9cfb08d3ed5369ad8e47ceae01eb6cf00b7a4200da2683e13a62c4668a0e5144d"

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
