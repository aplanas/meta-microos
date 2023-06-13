SUMMARY = "GSequencer core libraries -- Introspection bindings"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "typelib-1_0-Libags-5_0-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "81b9730a0d3eb4d2f736a595323d83265906ec34fcceea1a1772ca67e4a8b9ea5e96ae1500809b784aaa156b598c71714c4d6ed7ed7145a9280f9b75b0119153"

RPROVIDES:${PN} += "typelib(Ags) \
typelib(AgsAudio) \
typelib(AgsGui) \
typelib-1_0-Libags-5_0 \
typelib-1_0-Libags-5_0(aarch-64)"

RDEPENDS:${PN} += "libags.so.5()(64bit) \
libags_audio.so.5()(64bit) \
libags_gui.so.5()(64bit) \
libags_server.so.5()(64bit) \
libags_thread.so.5()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstBase) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2)"

inherit rpm
