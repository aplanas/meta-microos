SUMMARY = "Introspection bindings for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the libpeas \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "typelib-1_0-Peas-1_0-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "cfa47f90c2e1c065466e16cb2277334ca947280c55c0d865b587691cdf39a5174ae0ac8bcb9c6a27da247c67219068dac0c502561e096b59289fcea9922cbc5e"

RPROVIDES:${PN} += "typelib-1-0-Peas-1-0 \
typelib-Peas"

RDEPENDS:${PN} += "libpeas-1.0.so.0 \
typelib-GIRepository \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
