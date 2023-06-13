SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-Gck-1-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "a8cf883b687bd46f20eaad9c095ba982571bdf1855b96f944ef6007805b785bc6b731991e68dfe0969b7c79f9be778021cf14492f4baa15147bedfe6eb4c2ec9"

RPROVIDES:${PN} += "typelib(Gck) \
typelib-1_0-Gck-1 \
typelib-1_0-Gck-1(aarch-64)"

RDEPENDS:${PN} += "libgck-1.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
