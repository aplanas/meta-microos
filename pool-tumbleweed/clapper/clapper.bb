SUMMARY = "A GNOME media player built using GJS with GTK4"
DESCRIPTION = "A GNOME media player built using GJS with GTK4 toolkit and powered by GStreamer with OpenGL rendering."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "d0d4bce83c068bd19c1b1d4845422fc43f20e69802b1ca7c176f5f4facb0afa2e4ddd025cbb4cfa5780ca671eb6bcbd7b8f2f756810e3829a8f14580598f2e6d"

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
