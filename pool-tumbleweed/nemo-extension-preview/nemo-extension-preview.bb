SUMMARY = "A quick previewer for Nemo file manager"
DESCRIPTION = "This is NemoPreview, a quick previewer for Nemo, the Cinnamon \
desktop file manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-preview-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "63fbf55245a3f76f56960a4f711eef1e7dbd2677c329982b0cca125562b179cafa538678f10cd4d9c5c9724aafa1804d16f3cf18b40219db9f364739b27ba9c4"

RPROVIDES:${PN} += "libnemo-preview-1.0.so \
nemo-extension-preview \
nemo-extension-preview-devel \
nemo-preview \
typelib-NemoPreview"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libcjs.so.0 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0 \
libxreaderdocument.so.3 \
libxreaderview.so.3 \
nemo \
typelib-Atk \
typelib-Clutter \
typelib-ClutterGst \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo \
typelib-Gtk \
typelib-GtkClutter \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Json \
typelib-NemoPreview \
typelib-Pango \
typelib-PangoCairo \
typelib-WebKit2 \
typelib-XreaderDocument \
typelib-XreaderView \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
