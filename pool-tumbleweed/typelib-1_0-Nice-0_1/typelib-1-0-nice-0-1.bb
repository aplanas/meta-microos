SUMMARY = "Introspection bindings for libnice"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE). \
 \
This package provides the GObject Introspection bindings for libnice."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "typelib-1_0-Nice-0_1-0.1.21-2.1.aarch64.rpm"
RPM_HASH = "2b76035cfb7b7aeae24f54048c15424f5f58cbe8edc37b995b29f026c4f19c2b50b7a9d7c0e2063ec38b43ba2f6c06ce7866b73ac9539287feee163379d3675f"

RPROVIDES:${PN} += "typelib-1-0-Nice-0-1 \
typelib-Nice"

RDEPENDS:${PN} += "libnice.so.10 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
