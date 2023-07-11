SUMMARY = "Introspection bindings for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development. \
 \
This package provides the GObject Introspection bindings for \
libxklavier."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "typelib-1_0-Xkl-1_0-5.4-1.8.aarch64.rpm"
RPM_HASH = "efb62fe24e2e46d89641c10320b02492335830b26e51df4d9cc4ae34cc34b79ffabeebf697080198bfc88232cc03034df9fd29901f33a3f2c2dd633ab68a1f56"

RPROVIDES:${PN} += "typelib-1-0-Xkl-1-0 \
typelib-Xkl"

RDEPENDS:${PN} += "libxklavier.so.16 \
typelib-GLib \
typelib-GObject \
typelib-xlib"

inherit rpm
