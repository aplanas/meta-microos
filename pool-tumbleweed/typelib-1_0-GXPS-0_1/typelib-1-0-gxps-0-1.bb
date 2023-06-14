SUMMARY = "Library for rendering XPS documents -- Introspection bindings"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents. \
 \
This package provides the GObject Introspection bindings for libgxps."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "typelib-1_0-GXPS-0_1-0.3.2-1.11.aarch64.rpm"
RPM_HASH = "aa51ee4bc75dfd6eeded881200be9662c9b45492bb4b11a0df44918f69f78106c508e8f977171691b4cce17ddc1b6afad3dd6deb84f2051956a72fb7e754ccea"

RPROVIDES:${PN} += "typelib-1-0-GXPS-0-1 \
typelib-GXPS"

RDEPENDS:${PN} += "libgxps.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
