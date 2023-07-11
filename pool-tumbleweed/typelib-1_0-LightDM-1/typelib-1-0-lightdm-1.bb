SUMMARY = "GObject Introspection Bindings for the LightDM Client Library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
LightDM client library."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "typelib-1_0-LightDM-1-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "bd3220d7bc81e1d9f66701ff73e7618958d809e51696f3b9917f4b96672547a4505548ec0bc27c808668b7db1c84197ce6362c31862aa5c0297a2b82f082b2e7"

RPROVIDES:${PN} += "typelib-1-0-LightDM-1 \
typelib-LightDM"

RDEPENDS:${PN} += "liblightdm-gobject-1.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
