SUMMARY = "Minimalist radio station player"
DESCRIPTION = "An Internet Radio Station player for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "tuner-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "5c0ee9a1e75e4b6e4324a5bdd6be7a134f9207f02254a301599a90b9a5f346d4a81a9b7823e0da6103ac1435fc9c6a6d9bab2fff3b1062a48f7e12fa14edc223"

RPROVIDES:${PN} += "application() \
application(com.github.louis77.tuner.desktop) \
metainfo() \
metainfo(com.github.louis77.tuner.appdata.xml) \
tuner \
tuner(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgeocode-glib.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstplayer-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
