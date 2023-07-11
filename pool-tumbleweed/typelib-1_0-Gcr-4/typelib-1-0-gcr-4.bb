SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "typelib-1_0-Gcr-4-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "d0fd4320db97c76bf59adbb4125c8d785d311a1c024bfe4b3502625d1fe2740f3e7197e0e1e790fba59ae53fb876f145ad75015e6342a769c492f22c02d4f8e1"

RPROVIDES:${PN} += "typelib-1-0-Gcr-4 \
typelib-Gcr"

RDEPENDS:${PN} += "libgcr-4.so.4 \
typelib-1-0-Gck-2 \
typelib-GLib \
typelib-GObject \
typelib-Gck \
typelib-Gio"

inherit rpm
