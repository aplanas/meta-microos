SUMMARY = "A GObject-based Exiv2 wrapper - Introspection bindings"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the GObject Introspection bindings for the \
libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "typelib-1_0-GExiv2-0_10-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "e38253c8bcc2d08362772246578d1f188a97d8cd06d281e5e924ed5d4e4edff62e5b772bb0b7939df1763d5614422707cd27e9c7131495858ac277f97eae489f"

RPROVIDES:${PN} += "typelib-1-0-GExiv2-0-10 \
typelib-GExiv2"

RDEPENDS:${PN} += "libgexiv2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
