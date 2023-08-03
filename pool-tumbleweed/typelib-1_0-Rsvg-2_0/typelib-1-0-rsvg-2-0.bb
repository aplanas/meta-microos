SUMMARY = "Introspection bindings for librsvg, a SVG render library"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides the GObject Introspection bindings for librsvg."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.3"

RPM_NAME = "typelib-1_0-Rsvg-2_0-2.56.3-1.1.aarch64.rpm"
RPM_HASH = "463d5171b1039bd363f9593bb27f604be65b03a45fe4f9049b28202503931e86fabd6db4fa81611d757ff1ad04f5e4e9f7013562fbfe64402bf19469bc9d6a71"

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
