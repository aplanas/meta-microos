SUMMARY = "Introspection bindings for the NetworkManager client convenience library"
DESCRIPTION = "This package contains the gi-bindings that make it easier to use some \
Network Manager functionality from applications that use glib. \
 \
This package provides the GObject Introspection bindings for the \
NetworkManager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "typelib-1_0-NM-1_0-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "72bfd90d1b10969392a757611ef70a067105aefac7a3710f011fe6e7e51709512e3685274b53ff12699eda44abf01ce553a36e81067475a7549aee004071e09b"

RPROVIDES:${PN} += "typelib-1-0-NM-1-0 \
typelib-NM"

RDEPENDS:${PN} += "libnm.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
