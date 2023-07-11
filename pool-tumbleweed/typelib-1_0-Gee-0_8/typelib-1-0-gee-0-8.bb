SUMMARY = "Introspection bindings for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides the GObject Introspection bindings for Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "typelib-1_0-Gee-0_8-0.20.6-1.4.aarch64.rpm"
RPM_HASH = "845443ff6055cf336910ef9b3347d3c6020b4f3efc7071171870f6ea2ea13a801fa55d7b0933c102edcfb57d8d9298cf6cf64647bbde463a97657a2271d89bdb"

RPROVIDES:${PN} += "typelib-1-0-Gee-0-8 \
typelib-Gee"

RDEPENDS:${PN} += "libgee-0.8.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
