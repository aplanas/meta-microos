SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EDataCal-2_0-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "75017bb15d25d354d4ebe191294b20b8258bbb05997c3f2e9c21e1fdd05410099df4434341563e6cedd5c9dd7b262600aa90e9322275a8b2cd77b8ad847b79ea"

RPROVIDES:${PN} += "typelib-1-0-EDataCal-2-0 \
typelib-EDataCal"

RDEPENDS:${PN} += "libebackend-1.2.so.11 \
libecal-2.0.so.2 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
typelib-Camel \
typelib-EBackend \
typelib-ECal \
typelib-EDataServer \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-ICalGLib \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
