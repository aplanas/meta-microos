SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EBackend-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "de878eebc3f1c114fcbd1dbc1861fb6ce73a4ede3a8cf6791fd53560b02a7282df0e1e0587a775fb2f90e7df2262596dcdb3993bb6bd01ab7f6ead9cfd4e65f8"

RPROVIDES:${PN} += "typelib-1-0-EBackend-1-2 \
typelib-EBackend"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libebackend-1.2.so.11 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EDataServer \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
