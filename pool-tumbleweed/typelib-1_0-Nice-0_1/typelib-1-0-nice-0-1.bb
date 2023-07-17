SUMMARY = "Introspection bindings for libnice"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE). \
 \
This package provides the GObject Introspection bindings for libnice."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "typelib-1_0-Nice-0_1-0.1.21-3.1.aarch64.rpm"
RPM_HASH = "b5d986714aef8257f6511c98713816d0b4b6caab68afb9c2544c5317934904313280b2016a3ed133fffda830ac1d75feed2bc4272063c4c341b6856ba21500c3"

RPROVIDES:${PN} += "typelib-1-0-Nice-0-1 \
typelib-Nice"

RDEPENDS:${PN} += "libnice.so.10 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
