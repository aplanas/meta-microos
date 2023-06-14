SUMMARY = "Plugins for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package includes plugins for Totem, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-plugins-43.0-2.3.aarch64.rpm"
RPM_HASH = "442d2b537581280cbd3ec690eaef8673ebd65fa7d443cfa6f842e0e219fe0bee4cce2ebfb86c42f12f206c3bac3df5f0c086dd4669eeaaf2025b86923630e730"

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
