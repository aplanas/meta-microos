SUMMARY = "Introspection bindings for gtk-vnc"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the libgvnc \
library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "typelib-1_0-GVnc-1_0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "1c91f874d97d45135e6e2c6179559639ad5cdae6a6f8d766df4e0fefe21b87303c71591f5fed6ceb523e0d03278e2070c637a3a90a5452493c9a42331fa6f783"

RPROVIDES:${PN} += "typelib-1-0-GVnc-1-0 \
typelib-GVnc"

RDEPENDS:${PN} += "libgvnc-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
