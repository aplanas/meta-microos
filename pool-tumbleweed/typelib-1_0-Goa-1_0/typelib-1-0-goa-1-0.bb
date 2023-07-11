SUMMARY = "GNOME service to access online accounts -- Introspection bindings"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts. \
 \
This package provides the GObject Introspection bindings for the libgoa \
client library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "typelib-1_0-Goa-1_0-3.48.0-1.2.aarch64.rpm"
RPM_HASH = "f40210d9a6471f611f24f9f2c8f33ef533fe2e4feb873d9417884581fe9c970468249490bcf3ad5ec86f00a8f587bb5046914962c29c1a4a553d520017b05725"

RPROVIDES:${PN} += "typelib-1-0-Goa-1-0 \
typelib-Goa"

RDEPENDS:${PN} += "libgoa-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
