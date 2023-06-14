SUMMARY = "Minimalist radio station player"
DESCRIPTION = "An Internet Radio Station player for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "tuner-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "5c0ee9a1e75e4b6e4324a5bdd6be7a134f9207f02254a301599a90b9a5f346d4a81a9b7823e0da6103ac1435fc9c6a6d9bab2fff3b1062a48f7e12fa14edc223"

RPROVIDES:${PN} += "tuner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgeoclue-2.so.0 \
libgeocode-glib.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
