SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "typelib-1_0-Soup-3_0-3.4.2-1.1.aarch64.rpm"
RPM_HASH = "05360a27a2b0b802fbf66bd9d1bf56075cc325addda8af3a985d38809d35c09a0bbff823ca8ce46f93579fab444d4cf1974d4a66db7fa4519a18757cbc35fdf6"

RPROVIDES:${PN} += "typelib(Soup) \
typelib-1_0-Soup-3_0 \
typelib-1_0-Soup-3_0(aarch-64)"

RDEPENDS:${PN} += "libsoup-3.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
