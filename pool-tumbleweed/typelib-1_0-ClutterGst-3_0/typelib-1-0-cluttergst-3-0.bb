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

RPM_NAME = "typelib-1_0-ClutterGst-3_0-3.0.27-2.5.aarch64.rpm"
RPM_HASH = "fdda4c087649e220a7ceb29209b5a329ff23166cde040b8a586ee690f173049c5272ef446007d354d045c067fdc02c99122b0a2d09ce889e5c73f6bbd7887cbb"

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
