SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "typelib-1_0-Gck-2-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "7774140ad030ba230968bd760720aff8edb4d64610d403de4da68040cd23fd6a976ea41d55172f735999a49b1bbb18fed25ddd9ffcdd02c6d8de712dad3701bd"

RPROVIDES:${PN} += "typelib-1-0-Gck-2 \
typelib-Gck"

RDEPENDS:${PN} += "libgck-2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
