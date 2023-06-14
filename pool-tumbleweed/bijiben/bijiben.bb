SUMMARY = "Note editor for GNOME"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "bijiben-40.1-6.3.aarch64.rpm"
RPM_HASH = "fe2d99deb64ce6d075bf2cb5d41ebbe02ccb2eeaaca586d484ec2db1d7293d47d6361dede567551c8ff82f61e2b467592b54de36e5f9b740f836e6e0d3c6d66a"

RPROVIDES:${PN} += "bijiben"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libhandy-1.so.0 \
libical-glib.so.3 \
libjavascriptcoregtk-4.1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtracker-sparql-3.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
