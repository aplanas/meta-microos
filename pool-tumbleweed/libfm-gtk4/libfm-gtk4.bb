SUMMARY = "GTK libfm libraries"
DESCRIPTION = "GTK system libraries for libfm"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-gtk4-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "d037b7732df962a82212b878d80bf724f96fcc177802498615907d18ab1863f7ec403078ec74403cf4f78cecab07108c6d342996a671c33806480438be83cf90"

RPROVIDES:${PN} += "libfm-gtk.so.4()(64bit) \
libfm-gtk4 \
libfm-gtk4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libfm.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmenu-cache.so.3()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
