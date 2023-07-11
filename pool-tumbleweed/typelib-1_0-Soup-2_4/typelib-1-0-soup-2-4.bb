SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "typelib-1_0-Soup-2_4-2.74.3-1.4.aarch64.rpm"
RPM_HASH = "981003f48d201cf13ba7aad7a36e2da43614cd52e414e6532fe3fc2a1e728b0a541cac303627482ee507f7e41109362a05184fa6ff090c766673ab48ee43e2b3"

RPROVIDES:${PN} += "typelib-1-0-Soup-2-4 \
typelib-Soup \
typelib-SoupGNOME"

RDEPENDS:${PN} += "libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
