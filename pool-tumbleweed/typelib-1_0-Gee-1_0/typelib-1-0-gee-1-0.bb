SUMMARY = "GObject-based library providing commonly used data structures -- Introspection bindings"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides the GObject Introspection bindings for libgee."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "typelib-1_0-Gee-1_0-0.6.6-5.28.aarch64.rpm"
RPM_HASH = "8a29fbbd4129715e6040cb8d0258a3efa58b082f29fbaf574cd5ef3cbe4f7bdb4e7292c0842e8e988c728d36991e8b0d4df7522e9b67bbdb24b222d0ad85c988"

RPROVIDES:${PN} += "typelib(Gee) \
typelib-1_0-Gee-1_0 \
typelib-1_0-Gee-1_0(aarch-64)"
RDEPENDS:${PN} += "libgee.so.2()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
