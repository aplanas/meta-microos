SUMMARY = "Introspection bindings for GSequencer's core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.1"

RPM_NAME = "typelib-1_0-Libags-6_0-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "baf8cce57d27a47f27b0d931563ddec57f731dd9d64b496460c418b55c0f0c1031f4886e68ca581f551e367997424c4dc5da2f6d6a583ce7de289c5b970d5358"

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
