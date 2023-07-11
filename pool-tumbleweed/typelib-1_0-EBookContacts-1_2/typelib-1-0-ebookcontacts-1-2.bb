SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EBookContacts-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "984a7ef4e245b4c2bee51089291f223597be55582cd3467c46b17dd391148c52cc14ddd1fd20f164a5660d204168eb51c9c4dc651d42a17542fd1ed565474666"

RPROVIDES:${PN} += "typelib-1-0-EBookContacts-1-2 \
typelib-EBookContacts"

RDEPENDS:${PN} += "libebook-contacts-1.2.so.4 \
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
