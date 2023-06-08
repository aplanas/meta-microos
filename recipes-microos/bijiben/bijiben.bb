SUMMARY = "Note editor for GNOME"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "bijiben-40.1-6.3.aarch64.rpm"
RPM_HASH = "fe2d99deb64ce6d075bf2cb5d41ebbe02ccb2eeaaca586d484ec2db1d7293d47d6361dede567551c8ff82f61e2b467592b54de36e5f9b740f836e6e0d3c6d66a"

RPROVIDES:${PN} += "application() application(org.gnome.Notes.desktop) bijiben bijiben(aarch-64) metainfo() metainfo(org.gnome.Notes.appdata.xml) mimehandler(x-scheme-handler/note)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libecal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libical-glib.so.3()(64bit) libjavascriptcoregtk-4.1.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libtracker-sparql-3.0.so.0()(64bit) libwebkit2gtk-4.1.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
