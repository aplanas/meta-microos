SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator-0_1-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "817ade71285b51f373eb0fc75d33127099afae160c8f32ccfe27bffceca07fb5b8bf345f5413ded6c94b7bb49fb9357ebc5349ea2dc05730f66dee5a41c78f46"

RPROVIDES:${PN} += "typelib(AyatanaAppIndicator) \
typelib-1_0-AyatanaAppIndicator-0_1 \
typelib-1_0-AyatanaAppIndicator-0_1(aarch-64)"

RDEPENDS:${PN} += "libayatana-appindicator.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
