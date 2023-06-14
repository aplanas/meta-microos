SUMMARY = "CD Player and Ripper for GNOME"
DESCRIPTION = "Goobox is a CD player and ripper that always knows just what to do."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "goobox-3.6.0-3.9.aarch64.rpm"
RPM_HASH = "7f6cfc1a7d935d111c9d3726c5eeffcee0b40fffac3bae8020987fc0658c9d4a7909c6caa6031a9a8bb2ef0aa87326e42ce76856900ec86182687d7c7d78526b"

RPROVIDES:${PN} += "goobox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libc.so.6 \
libdiscid.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0"

inherit rpm
