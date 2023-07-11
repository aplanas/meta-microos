SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-ECal-2_0-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "67a6e39b0c034f1eabb759c77b1dd46eb88d283649aa0028a924637e79298f5bba84c4fc45f35f837e7ff7e2104bdca501cbc5172902859eae4a0275d9295e60"

RPROVIDES:${PN} += "typelib-1-0-ECal-2-0 \
typelib-ECal"

RDEPENDS:${PN} += "libecal-2.0.so.2 \
typelib-Camel \
typelib-EDataServer \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-ICalGLib \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
