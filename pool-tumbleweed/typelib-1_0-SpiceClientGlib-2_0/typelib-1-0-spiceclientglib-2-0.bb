SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGlib-2_0-0.42-1.3.aarch64.rpm"
RPM_HASH = "470249c12890c82ff3fe7576100dd0304dc76ffb23a3d0ae688febe0619585c023fa7edeb39e811facabc2d3ba3a975053c850972fde06bf9c260c796e3d1b54"

RPROVIDES:${PN} += "typelib(SpiceClientGLib) \
typelib-1_0-SpiceClientGlib-2_0 \
typelib-1_0-SpiceClientGlib-2_0(aarch-64)"

RDEPENDS:${PN} += "libspice-client-glib-2.0.so.8()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Gst) \
typelib(GstBase)"

inherit rpm
