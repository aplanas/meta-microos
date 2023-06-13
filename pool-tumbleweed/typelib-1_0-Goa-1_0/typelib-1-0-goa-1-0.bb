SUMMARY = "GNOME service to access online accounts -- Introspection bindings"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts. \
 \
This package provides the GObject Introspection bindings for the libgoa \
client library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "typelib-1_0-Goa-1_0-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "8a1fa8f0a7421853837838d6f82eb51b1b7ebe10444d4510f6add9251702dcaf9ec251a8a75ae621bc7008d76af9771885689792dc1f588d5730044fee80229e"

RPROVIDES:${PN} += "typelib(Goa) \
typelib-1_0-Goa-1_0 \
typelib-1_0-Goa-1_0(aarch-64)"

RDEPENDS:${PN} += "libgoa-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
