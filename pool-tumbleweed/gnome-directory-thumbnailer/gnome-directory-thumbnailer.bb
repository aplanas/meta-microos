SUMMARY = "Directory Thumbnailer"
DESCRIPTION = "GNOME thumbnailer to generate thumbnails for directories."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "gnome-directory-thumbnailer-0.1.11-3.3.aarch64.rpm"
RPM_HASH = "3ce6900c1b82a1c2fae408fff46ecf438efeef482cbb8a7ed4e0657a70f8c40e151d8d441f9c40bd1c76793de3afff0d0f97a149b39d89952b2f20431ea9ccd3"

RPROVIDES:${PN} += "gnome-directory-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
