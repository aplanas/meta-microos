SUMMARY = "Library for rendering XPS documents -- Introspection bindings"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents. \
 \
This package provides the GObject Introspection bindings for libgxps."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "typelib-1_0-GXPS-0_1-0.3.2-1.12.aarch64.rpm"
RPM_HASH = "69cf9813d0d0e2d225857462ec7260fdfa93eecf2be80650285c973032c831287f3ead080fcc76c4b37cbc371a3b469ef597596827f6cc467cee18251bc0317d"

RPROVIDES:${PN} += "typelib-1-0-GXPS-0-1 \
typelib-GXPS"

RDEPENDS:${PN} += "libgxps.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
