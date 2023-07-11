SUMMARY = "Minimalist radio station player"
DESCRIPTION = "An Internet Radio Station player for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "tuner-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "c4eed2fad13b3cec783bcead5c63126b485e7f4c5502b9bafba0f2355e9724b83e206f8d4ca7a52669faad5f25d584031b8c27b0f554ec539824d4464867c7ff"

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
