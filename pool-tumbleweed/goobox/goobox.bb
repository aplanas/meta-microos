SUMMARY = "CD Player and Ripper for GNOME"
DESCRIPTION = "Goobox is a CD player and ripper that always knows just what to do."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "goobox-3.6.0-3.9.aarch64.rpm"
RPM_HASH = "7f6cfc1a7d935d111c9d3726c5eeffcee0b40fffac3bae8020987fc0658c9d4a7909c6caa6031a9a8bb2ef0aa87326e42ce76856900ec86182687d7c7d78526b"

RPROVIDES:${PN} += "application() \
application(org.gnome.Goobox.desktop) \
goobox \
goobox(aarch-64) \
metainfo() \
metainfo(org.gnome.Goobox.appdata.xml) \
mimehandler(x-content/audio-cdda)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrasero-media3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdiscid.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmusicbrainz5.so.1()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
