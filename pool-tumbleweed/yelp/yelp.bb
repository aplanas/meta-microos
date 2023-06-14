SUMMARY = "Help Browser for the GNOME Desktop"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer."
LICENSE = "GPL-2.0-or-later"

PV = "42.2"

RPM_NAME = "yelp-42.2-1.3.aarch64.rpm"
RPM_HASH = "d97643d69fc82ea4f3c6a491e77efed2b740e14ef191923ec6817f6fc1b907f2905e647f6767abc3dc0977efe07067daf31d7752c3e8d31622d504e9dd20c575"

RPROVIDES:${PN} += "libyelpwebextension.so \
suse-help-viewer \
yelp"

RDEPENDS:${PN} += "docbook-4 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexslt.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libharfbuzz.so.0 \
libjavascriptcoregtk-4.1.so.0 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2 \
libxslt.so.1 \
libyelp.so.0 \
libz.so.1 \
yelp-xsl"

inherit rpm
