SUMMARY = "Linux Feed Reader"
DESCRIPTION = "Liferea is an abbreviation for Linux Feed Reader. It is a news \
aggregator for online news feeds. It supports a number of different \
feed formats including RSS/RDF, CDF, Atom, OCS, and OPML. There are \
many other news readers available, but these others are not available \
for Linux or require many extra libraries to be installed. Liferea \
tries to fill this gap by creating a fast, easy-to-use, easy-to-install \
news aggregator for GTK and GNOME."
LICENSE = "GPL-2.0-only"

PV = "1.14.5"

RPM_NAME = "liferea-1.14.5-1.1.aarch64.rpm"
RPM_HASH = "1704df2df9bbe3d1fb3fc486d6a4122c5ba037a886bd8299dd51c10f8daa15d989995349d34568d33639416ee0056d6d3cbe21a6b9145c4d954d53aaff224aac"

RPROVIDES:${PN} += "liblifereawebextension.so \
liferea \
typelib-Liferea"

RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libwebkit2gtk-4.0.so.37 \
libxml2.so.2 \
libxslt.so.1 \
python3-cairo \
python3-gobject-Gdk \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Notify \
typelib-Pango \
typelib-Peas \
typelib-PeasGtk \
typelib-Secret \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
