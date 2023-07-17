SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGlib-2_0-0.42-2.1.aarch64.rpm"
RPM_HASH = "c3cd028c89403143b5b47c985ba096a43ec9c362e256c580638bfb26087c883911722074bf4549e0cc63db268aa43423451e21fc813ba89d9128fef08cdc22d4"

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
