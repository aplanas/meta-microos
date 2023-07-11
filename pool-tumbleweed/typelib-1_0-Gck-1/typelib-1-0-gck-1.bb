SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-Gck-1-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "97b7a090bc89858261f7720639f0f2cf8a06fa3f0ea6d904f313602a8e2fe88dccfebaa337367b90205c3e54632376005af5c6b303014c38d8dd4612e277c1ee"

RPROVIDES:${PN} += "typelib-1-0-Gck-1 \
typelib-Gck"

RDEPENDS:${PN} += "libgck-1.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
