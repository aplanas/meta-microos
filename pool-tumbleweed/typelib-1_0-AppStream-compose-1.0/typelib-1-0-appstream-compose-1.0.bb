SUMMARY = "Introspection bindings for  AppStream Compose"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream Compose"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "typelib-1_0-AppStream-compose-1.0-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "399181980a0d4d35e41f5fb6e9067dc4a33ca12f278974ec22fb7de56b87bee6a0b5ce9780cdc0286c632fd9c65d3a0611786acc35bae952a3d923f541b101f3"

RPROVIDES:${PN} += "typelib-1-0-AppStream-compose-1.0 \
typelib-AppStreamCompose"

RDEPENDS:${PN} += "libappstream-compose.so.0 \
typelib-AppStream \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
