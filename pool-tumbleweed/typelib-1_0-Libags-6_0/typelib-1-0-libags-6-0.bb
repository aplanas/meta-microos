SUMMARY = "Introspection bindings for GSequencer's core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.8"

RPM_NAME = "typelib-1_0-Libags-6_0-6.0.8-1.1.aarch64.rpm"
RPM_HASH = "b3bba92ab908cee90e24b0a5338d98fe43813374b73a46f332edf3f1c645619863c21e4e66021542adc6503f5506fd14cdc3975c1bb67b28ec7fe426f3b0fe1e"

RPROVIDES:${PN} += "typelib-1-0-Libags-6-0 \
typelib-Ags \
typelib-AgsAudio \
typelib-AgsGui"

RDEPENDS:${PN} += "libags-audio.so.6 \
libags-gui.so.6 \
libags-server.so.6 \
libags-thread.so.6 \
libags.so.6 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2"

inherit rpm
