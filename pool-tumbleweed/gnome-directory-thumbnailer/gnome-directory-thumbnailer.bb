SUMMARY = "Directory Thumbnailer"
DESCRIPTION = "GNOME thumbnailer to generate thumbnails for directories."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "gnome-directory-thumbnailer-0.1.11-3.3.aarch64.rpm"
RPM_HASH = "3ce6900c1b82a1c2fae408fff46ecf438efeef482cbb8a7ed4e0657a70f8c40e151d8d441f9c40bd1c76793de3afff0d0f97a149b39d89952b2f20431ea9ccd3"

RPROVIDES:${PN} += "gnome-directory-thumbnailer \
gnome-directory-thumbnailer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
