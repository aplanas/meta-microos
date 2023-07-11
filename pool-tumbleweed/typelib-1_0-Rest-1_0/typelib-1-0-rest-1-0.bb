SUMMARY = "Library to access RESTful web services -- Introspection bindings"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
This package provides the GObject Introspection bindings for librest."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "typelib-1_0-Rest-1_0-0.9.1-3.2.aarch64.rpm"
RPM_HASH = "bd6f0fe710176f21ec5824aa845613621dd4446730d8bde6bb345b9c4ceaa6f61a58977212bf9afd46d206710424a943cc82240d9bb3ea542b003a7c4a7c67a2"

RPROVIDES:${PN} += "typelib-1-0-Rest-1-0 \
typelib-Rest \
typelib-RestExtras"

RDEPENDS:${PN} += "librest-1.0.so.0 \
librest-extras-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
