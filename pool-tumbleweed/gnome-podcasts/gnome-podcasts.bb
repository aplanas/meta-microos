SUMMARY = "Podcast app for GNOME"
DESCRIPTION = "A Podcast application for GNOME. \
Listen to your favorite podcasts, right from your desktop."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "gnome-podcasts-0.5.1-2.9.aarch64.rpm"
RPM_HASH = "1a32e392ac7ab68d36551e04a6a15169c65a73b76677b8806bcb09a9dbb9297cd98a960b3d2b1a607b59d0b12bc903f62c5d7bb6aa484ce425e154a3b5005069"

RPROVIDES:${PN} += "application() \
application(org.gnome.Podcasts.desktop) \
gnome-podcasts \
gnome-podcasts(aarch-64) \
metainfo() \
metainfo(org.gnome.Podcasts.appdata.xml)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstplayer-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
