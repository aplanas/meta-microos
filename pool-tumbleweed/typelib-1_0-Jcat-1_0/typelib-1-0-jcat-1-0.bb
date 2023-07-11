SUMMARY = "Introspection bindings for libjcat"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.14"

RPM_NAME = "typelib-1_0-Jcat-1_0-0.1.14-1.1.aarch64.rpm"
RPM_HASH = "151560c2f4b34151775bf38d21bf8af447288f602a199a0c559780de59dcd27dde5772390c20a13db6618cd31fa97c9199098c2c2b3008d21ed70efd13ecec59"

RPROVIDES:${PN} += "typelib-1-0-Jcat-1-0 \
typelib-Jcat"

RDEPENDS:${PN} += "libjcat.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json"

inherit rpm
