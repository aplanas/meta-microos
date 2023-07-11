SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGlib-2_0-0.42-1.5.aarch64.rpm"
RPM_HASH = "1f75d2d6ad42cdea9b9e02f8505cb6091b79413f44b0dede543f4e1c94be847d80b534299407e28a00ccdccc15b7ba8078dbccc5dabef16afe2d084a349e91c7"

RPROVIDES:${PN} += "typelib-1-0-SpiceClientGlib-2-0 \
typelib-SpiceClientGLib"

RDEPENDS:${PN} += "libspice-client-glib-2.0.so.8 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase"

inherit rpm
