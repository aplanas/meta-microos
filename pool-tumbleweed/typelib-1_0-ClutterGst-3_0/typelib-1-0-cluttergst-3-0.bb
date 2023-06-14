SUMMARY = "GStreamer integration for Clutter -- Introspection bindings"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter. \
 \
This package provides the GObject Introspection bindings for Clutter \
GStreamer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "typelib-1_0-ClutterGst-3_0-3.0.27-2.4.aarch64.rpm"
RPM_HASH = "c1c1e5efce0a4bf92741245b8b1af49327ad51a71edd34a67905958ca812dcb7dee26e9316dd69bb27648ab07c3c2cc4c86898bf9c4ff353f6fb85c87fb5d1eb"

RPROVIDES:${PN} += "typelib-1-0-ClutterGst-3-0 \
typelib-ClutterGst"

RDEPENDS:${PN} += "libclutter-gst-3.0.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
