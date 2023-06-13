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

RPROVIDES:${PN} += "application() \
application(net.sourceforge.liferea.desktop) \
liblifereawebextension.so()(64bit) \
liferea \
liferea(aarch-64) \
metainfo() \
metainfo(net.sourceforge.liferea.appdata.xml) \
mimehandler(application/atom+xml) \
mimehandler(application/rdf+xml) \
mimehandler(application/rss+xml) \
mimehandler(x-scheme-handler/feed) \
typelib(Liferea)"

RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
python3-cairo \
python3-gobject-Gdk \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gst) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Notify) \
typelib(Pango) \
typelib(Peas) \
typelib(PeasGtk) \
typelib(Secret) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2) \
typelib(xlib)"

inherit rpm
