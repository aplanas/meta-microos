SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator3-0_1-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "f100972cee586aafea5489d0f0771e2984f9154ec602feff7c5d60ac57e499d1d753c1a1175d09daa3aa7f707bb00f2535562d64be381dd61ee9d9cdf188ab15"

RPROVIDES:${PN} += "typelib(AyatanaAppIndicator3) \
typelib-1_0-AyatanaAppIndicator3-0_1 \
typelib-1_0-AyatanaAppIndicator3-0_1(aarch-64)"

RDEPENDS:${PN} += "libayatana-appindicator3.so.1()(64bit) \
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
typelib(freetype2) \
typelib(xlib)"

inherit rpm
