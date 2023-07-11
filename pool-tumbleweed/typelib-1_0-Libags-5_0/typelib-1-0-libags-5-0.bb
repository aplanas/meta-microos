SUMMARY = "Introspection bindings for GSequencer's core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.4.0"

RPM_NAME = "typelib-1_0-Libags-5_0-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "6be7433997b06fa0b128e8f4d8b46148e2b2723f201dc4001e7cc31e982aa09ff9c9134ec7ff00cf7121cb67a909cb52ff9a6eca3efd0cccff01d8e541768dca"

RPROVIDES:${PN} += "typelib-1-0-Libags-5-0 \
typelib-Ags \
typelib-AgsAudio \
typelib-AgsGui"

RDEPENDS:${PN} += "libags-audio.so.5 \
libags-gui.so.5 \
libags-server.so.5 \
libags-thread.so.5 \
libags.so.5 \
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
