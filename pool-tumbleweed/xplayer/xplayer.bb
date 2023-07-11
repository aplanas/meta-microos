SUMMARY = "Generic media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-2.4.4-1.4.aarch64.rpm"
RPM_HASH = "f34f24eeadd15b4ddb2933a9a2f7dae3b477e47ee4f65781790a5d066d3a46c2beaa640fb9a1f0966cb77a645cb5c37cf2c16ddf04e2617b71b7409923cfc57a"

RPROVIDES:${PN} += "libxplayer.so.0 \
typelib-Xplayer \
xplayer"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gstreamer-plugin-cluttergst3 \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
iso-codes \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libxapp.so.1 \
libxplayer-plparser.so.18 \
python3-gobject-Gdk \
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
typelib-XplayerPlParser \
typelib-cairo \
typelib-freetype2 \
typelib-xlib \
xplayer-plugins"

inherit rpm
