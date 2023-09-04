SUMMARY = "Introspection bindings for libfprint"
DESCRIPTION = "This package contains the introspection bindings for the libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "typelib-1_0-FPrint-2_0-1.94.6+tod1-1.1.aarch64.rpm"
RPM_HASH = "168626c5e275921670f820ab061765006c6faa18eff1738d53295a2909ca9c277a49363b77febf185cc2437b91b8030ef14b1e126e54275776ce8a49f2451231"

RPROVIDES:${PN} += "typelib-1-0-FPrint-2-0 \
typelib-FPrint"

RDEPENDS:${PN} += "libfprint-2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-GUsb \
typelib-Gio"

inherit rpm
