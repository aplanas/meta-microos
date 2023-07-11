SUMMARY = "Introspection bindings for libdbusmenu-glib4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the dbusmenu \
library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-Dbusmenu-0_4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "9d8815d53e39ba417d49477f772dbe981bc99de3bb2ee57175fcd2244409440c02ab923e17bdeeafd1181d46d8942e5fc627eeb3d5b69974cc12605eef40c0f5"

RPROVIDES:${PN} += "typelib-1-0-Dbusmenu-0-4 \
typelib-Dbusmenu"

RDEPENDS:${PN} += "libdbusmenu-glib.so.4 \
typelib-GLib \
typelib-GObject"

inherit rpm
