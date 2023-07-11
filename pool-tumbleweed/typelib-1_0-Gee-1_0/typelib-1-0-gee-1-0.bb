SUMMARY = "GObject-based library providing commonly used data structures -- Introspection bindings"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides the GObject Introspection bindings for libgee."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "typelib-1_0-Gee-1_0-0.6.6-5.29.aarch64.rpm"
RPM_HASH = "4e9832e82b86e40924b3b172902f4e2f4e34db3ba4cbc219e49acc6f0ff366d5aa38dde1d740dfb498fc921777edb4b8cf9c73fa78f05c1c6ffa8ff9017db08e"

RPROVIDES:${PN} += "typelib-1-0-Gee-1-0 \
typelib-Gee"

RDEPENDS:${PN} += "libgee.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
