SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EDataBook-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "05572051a58f87edc724c563bb3df56c26ce8db3a1e1939fb6a9f554bb34ba07c37e0c3cb9bfe5e4684c2dde93cea3142ca51d500a627d6c5ee0c5beb9ba831c"

RPROVIDES:${PN} += "typelib-1-0-EDataBook-1-2 \
typelib-EDataBook"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libebook-contacts-1.2.so.4 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBackend \
typelib-EBookContacts \
typelib-EDataServer \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
