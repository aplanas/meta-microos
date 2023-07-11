SUMMARY = "Plugins for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package includes plugins for Totem, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-plugins-43.0-2.4.aarch64.rpm"
RPM_HASH = "3e8cf6d79c423d9536f00e1e263e2baa8ca362517b78ff84e048215973c1a84cae57aeb2436e0af390c888915859b3ef72e9d423ac83535c3a1a89c56710127b"

RPROVIDES:${PN} += "libapple-trailers.so \
libautoload-subtitles.so \
libmovie-properties.so \
libmpris.so \
libopen-directory.so \
librecent.so \
librotation.so \
libsave-file.so \
libscreensaver.so \
libscreenshot.so \
libskipto.so \
libtotem-im-status.so \
libvariable-rate.so \
libvimeo.so \
totem-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libtotem.so.0 \
totem \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Peas \
typelib-Totem"

inherit rpm
