SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EDataServer-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "5ceed9fbc40d58ab26b8adcfd9b1307eb369cca9433867dc56c9d1c296a6e0d69150d277eeb116cdcc3ee61fedbf38c291b31cf69e89446a4203fa967ee853e0"

RPROVIDES:${PN} += "typelib-1-0-EDataServer-1-2 \
typelib-EDataServer"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
