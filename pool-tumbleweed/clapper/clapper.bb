SUMMARY = "A GNOME media player built using GJS with GTK4"
DESCRIPTION = "A GNOME media player built using GJS with GTK4 toolkit and powered by GStreamer with OpenGL rendering."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "3dc3006bba0ff657289f30e205aaa8f7ce9ab9a1aa1a0ab8ac81efcd5752841d43d59fb240b34980b7b7eb894158a1161100559b6fb063277f7fe1be5f7f2eb7"

RPROVIDES:${PN} += "clapper \
gstreamer1 \
libgstclapper.so \
libgstclapperglimporter.so \
libgstclappergluploader.so \
libgstclapperrawimporter.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstclapperglbaseimporter.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-GstClapper \
typelib-Gtk \
typelib-Pango \
typelib-Soup"

inherit rpm
