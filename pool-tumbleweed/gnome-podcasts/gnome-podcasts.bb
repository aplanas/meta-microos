SUMMARY = "Podcast app for GNOME"
DESCRIPTION = "A Podcast application for GNOME. \
Listen to your favorite podcasts, right from your desktop."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "gnome-podcasts-0.5.1-2.11.aarch64.rpm"
RPM_HASH = "7983a168a0f9d7dde56e303d068dd8d08e87ea4cc5118d26be83295848dfd5698eca8443ad88489f99e81cc8d99e2407aceb4c4275c0adfbdd2345c7846b7b63"

RPROVIDES:${PN} += "gnome-podcasts"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libsqlite3.so.0 \
libssl.so.3"

inherit rpm
