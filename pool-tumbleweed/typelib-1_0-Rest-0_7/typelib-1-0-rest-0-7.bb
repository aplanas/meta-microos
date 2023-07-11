SUMMARY = "Library to access RESTful web services -- Introspection bindings"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
This package provides the GObject Introspection bindings for librest."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1"

RPM_NAME = "typelib-1_0-Rest-0_7-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "58a38f7bf779e00ee9d67f8ef8581049d02061c6066d8401ebb60127262edec028fc4e2308aa2410d04e0cb01d3f662c8242ca0a29fb687b14d72501116af24c"

RPROVIDES:${PN} += "typelib-1-0-Rest-0-7 \
typelib-Rest \
typelib-RestExtras"

RDEPENDS:${PN} += "librest-0.7.so.0 \
librest-extras-0.7.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Soup \
typelib-libxml2"

inherit rpm
