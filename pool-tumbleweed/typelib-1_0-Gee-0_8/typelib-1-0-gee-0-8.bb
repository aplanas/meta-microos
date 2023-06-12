SUMMARY = "Introspection bindings for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides the GObject Introspection bindings for Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "typelib-1_0-Gee-0_8-0.20.6-1.3.aarch64.rpm"
RPM_HASH = "ae591786cf77af69a4a3c46c3916e50a4abe17e2eed67cd00cb9e7c6349f053f87bae9cf2dd94bdae7626f00c033b46ac824428e2d7c91257221f40ff2dc61c6"

RPROVIDES:${PN} += "typelib(Gee) \
typelib-1_0-Gee-0_8 \
typelib-1_0-Gee-0_8(aarch-64)"
RDEPENDS:${PN} += "libgee-0.8.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
