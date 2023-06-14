SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "gnome-shell-search-provider-bijiben-40.1-6.3.aarch64.rpm"
RPM_HASH = "c317d58013c18de09b15a885183051782c0c1dec7761898cd560009c684a598310d1444a16e1a54dd9db843c44b363a43393ef30892a54d1528df43521c153a3"

RPROVIDES:${PN} += "gnome-shell-search-provider-bijiben"

RDEPENDS:${PN} += "bijiben \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libjavascriptcoregtk-4.1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtracker-sparql-3.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
