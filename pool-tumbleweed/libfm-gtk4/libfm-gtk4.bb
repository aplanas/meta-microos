SUMMARY = "GTK libfm libraries"
DESCRIPTION = "GTK system libraries for libfm"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-gtk4-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "d037b7732df962a82212b878d80bf724f96fcc177802498615907d18ab1863f7ec403078ec74403cf4f78cecab07108c6d342996a671c33806480438be83cf90"

RPROVIDES:${PN} += "libfm-gtk.so.4 \
libfm-gtk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfm.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libmenu-cache.so.3 \
libpango-1.0.so.0"

inherit rpm
