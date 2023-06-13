SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "gnome-shell-search-provider-bijiben-40.1-6.3.aarch64.rpm"
RPM_HASH = "c317d58013c18de09b15a885183051782c0c1dec7761898cd560009c684a598310d1444a16e1a54dd9db843c44b363a43393ef30892a54d1528df43521c153a3"

RPROVIDES:${PN} += "gnome-shell-search-provider-bijiben \
gnome-shell-search-provider-bijiben(aarch-64)"

RDEPENDS:${PN} += "bijiben \
gnome-shell \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libjavascriptcoregtk-4.1.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libtracker-sparql-3.0.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
