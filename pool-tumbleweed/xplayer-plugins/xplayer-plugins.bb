SUMMARY = "Plugins for xplayer media player"
DESCRIPTION = "xplayer is a media player based on GStreamer for the Cinnamon \
desktop and others. It features a playlist, a full-screen mode, \
seek and volume controls, and complete keyboard navigation. \
 \
This package includes plugins for xplayer, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-plugins-2.4.4-1.4.aarch64.rpm"
RPM_HASH = "26e0971f2539025b82a0cb65f31d89926dc8de25674842e723476692259710b525556b2d976dd8d8c1f5485c11e5fc7f87aa565db015b4b42c07b7b7962c956b"

RPROVIDES:${PN} += "libapple-trailers.so \
libautoload-subtitles.so \
libbrasero-disc-recorder.so \
libchapters.so \
libgrilo.so \
libgromit.so \
liblirc.so \
libmedia-player-keys.so \
libmovie-properties.so \
libontop.so \
librecent.so \
librotation.so \
libscreensaver.so \
libscreenshot.so \
libskipto.so \
libvimeo.so \
libxplayer-im-status.so \
xplayer-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libgtk-3.so.0 \
liblirc-client.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libwayland-server.so.0 \
libxml2.so.2 \
libxplayer.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Peas \
typelib-Xplayer \
xplayer"

inherit rpm
