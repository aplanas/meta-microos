SUMMARY = "Introspection bindings for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.2"

RPM_NAME = "typelib-1_0-GjsPrivate-1_0-1.76.2-1.1.aarch64.rpm"
RPM_HASH = "843a8520a331c142cb441efef7e8841321ef74e37b19502658b2fa57cd2622e70554c41014c96d01332f809e38a5032a67016cdace9a42c0989e190dc72f18a8"

RPROVIDES:${PN} += "typelib-1-0-GjsPrivate-1-0 \
typelib-GjsPrivate"

RDEPENDS:${PN} += "libgjs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
