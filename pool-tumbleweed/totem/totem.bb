SUMMARY = "Movie Player for the GNOME Desktop"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. It \
features a playlist, a full-screen mode, seek and volume controls, and \
complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-43.0-2.3.aarch64.rpm"
RPM_HASH = "4d6a12fe767c4227d0309ebf794bc220418681bd3b73026943b54bbe3e29e5e825f60c68f9e5b3d7721e63ac4c7f771b50c9bdeefd5d22db84ca72bbf6143b3c"

RPROVIDES:${PN} += "libtotem.so.0 \
totem \
typelib-Totem"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-gtk \
iso-codes \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libgrlpls-0.3.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libtotem-plparser.so.18 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-TotemPlParser \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
