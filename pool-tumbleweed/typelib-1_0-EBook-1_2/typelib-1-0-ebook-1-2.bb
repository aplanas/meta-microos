SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EBook-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "f591c6124394d9b6a0896f8a60ecffa9047d6309344e02b6dd242cf21ee466cf44bea294fe1e3147872d4be912df07a0f9cf81a805dde452d962c3e1264b3a01"

RPROVIDES:${PN} += "typelib-1-0-EBook-1-2 \
typelib-EBook"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBookContacts \
typelib-EDataServer \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
