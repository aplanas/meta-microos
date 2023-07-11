SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EBook-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "302c402b3fcee2e4a8a6dae195daead2f49221b726c8ce499f2651a6407eb425528eb8ab063aefd380a4984d8612ad99fde9cf9eaafedc888a5dd829708bcdc8"

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
