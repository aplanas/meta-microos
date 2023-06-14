SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EDataBook-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "1c193d2d9eb39c5ce6a31c948b6d4162ad29b4b2ac65cf3e88fc080cdf6d9293f70d75d8031d1b0e3fdc3e50a27fe7d85d2eac6d86b727f72f5699e2cb97121d"

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
