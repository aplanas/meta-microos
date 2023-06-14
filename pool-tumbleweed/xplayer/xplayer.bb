SUMMARY = "Generic media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "1ed1baad44c623fcc6db8b4b74f5c4c13e755ba56d14a557c5d23b7459389fd94a0bc4020fcf4223a4b2d5b85b068582ca02d3943df3601cd43d44d3c528f3ce"

RPROVIDES:${PN} += "libxplayer.so.0 \
typelib-Xplayer \
xplayer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
