SUMMARY = "Help Browser for the GNOME Desktop"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer."
LICENSE = "GPL-2.0-or-later"

PV = "42.2"

RPM_NAME = "yelp-42.2-1.3.aarch64.rpm"
RPM_HASH = "d97643d69fc82ea4f3c6a491e77efed2b740e14ef191923ec6817f6fc1b907f2905e647f6767abc3dc0977efe07067daf31d7752c3e8d31622d504e9dd20c575"

RPROVIDES:${PN} += "application() \
application(yelp.desktop) \
libyelpwebextension.so()(64bit) \
metainfo() \
metainfo(yelp.appdata.xml) \
mimehandler(x-scheme-handler/ghelp) \
mimehandler(x-scheme-handler/help) \
mimehandler(x-scheme-handler/info) \
mimehandler(x-scheme-handler/man) \
suse_help_viewer \
yelp \
yelp(aarch-64)"

RDEPENDS:${PN} += "docbook_4 \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libexslt.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libharfbuzz.so.0()(64bit) \
libjavascriptcoregtk-4.1.so.0()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libyelp.so.0()(64bit) \
libz.so.1()(64bit) \
yelp-xsl"

inherit rpm
