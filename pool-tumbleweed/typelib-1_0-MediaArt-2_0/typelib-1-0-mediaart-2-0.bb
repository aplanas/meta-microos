SUMMARY = "Introspection bindings for the Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.6"

RPM_NAME = "typelib-1_0-MediaArt-2_0-1.9.6-1.4.aarch64.rpm"
RPM_HASH = "16eda953a2fadbf9823f1c96cd4fc724b062beaec74f2fde3ef90fead1673ca9af510d7153e08ede2d73d9088c7f48dee0ef8b19299857e3334773160654f452"

RPROVIDES:${PN} += "typelib(MediaArt) \
typelib-1_0-MediaArt-2_0 \
typelib-1_0-MediaArt-2_0(aarch-64)"

RDEPENDS:${PN} += "libmediaart-2.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
