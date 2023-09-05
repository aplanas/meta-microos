SUMMARY = "Introspection bindings for  AppStream Compose"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream Compose"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "typelib-1_0-AppStream-compose-1.0-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "2659fde8314a04ae4f2abc6c0f39c8b960097b25330110c555049881b7d8fd114b36234150975af7700df7b7d0a2c2eafa9d3bcc9afcd97d64e75b2edf03b5c8"

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
