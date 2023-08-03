SUMMARY = "A GObject-based Exiv2 wrapper - Introspection bindings"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the GObject Introspection bindings for the \
libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.2"

RPM_NAME = "typelib-1_0-GExiv2-0_10-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "4215271e7dc9ce3a1efd4e68ae987c377e38855344c2f0b1c8ca21175c681ba1a45ddbf9f79959680fd410bf5fdea8d63f5f45f8802b272b93f3adbe25839cb5"

RPROVIDES:${PN} += "typelib-1-0-GExiv2-0-10 \
typelib-GExiv2"

RDEPENDS:${PN} += "libgexiv2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
