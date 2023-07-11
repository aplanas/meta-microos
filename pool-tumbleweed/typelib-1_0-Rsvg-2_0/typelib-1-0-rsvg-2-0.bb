SUMMARY = "Introspection bindings for librsvg, a SVG render library"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides the GObject Introspection bindings for librsvg."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "typelib-1_0-Rsvg-2_0-2.56.1-3.1.aarch64.rpm"
RPM_HASH = "0d1e3b66dfe0994234d7f2cee88b03bad8b31f063653db11d9bb82a25fc4a9c05874da959821e4c3e8f37a8dda0220a8db16712a529865dd5ce489e6407af7ff"

RPROVIDES:${PN} += "typelib-1-0-Rsvg-2-0 \
typelib-Rsvg"

RDEPENDS:${PN} += "librsvg-2.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-cairo"

inherit rpm
