SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "typelib-1_0-Soup-2_4-2.74.3-2.1.aarch64.rpm"
RPM_HASH = "66fd4d9518624a997070853b48a6fdbbed38a2a0c5ae7ce50b02e7f2e3e91ecc4b2f14f64679e8275e90d072253cf8f36a2d32583f361da15ecc0eb87dd2306c"

RPROVIDES:${PN} += "typelib-1-0-Soup-2-4 \
typelib-Soup \
typelib-SoupGNOME"

RDEPENDS:${PN} += "libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
