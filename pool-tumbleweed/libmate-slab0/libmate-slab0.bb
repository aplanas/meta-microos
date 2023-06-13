SUMMARY = "MATE Desktop libslab port"
DESCRIPTION = "This library makes it easy to create tile-based UI for MATE, as seen in \
gnome-main-menu."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmate-slab0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "7fc6fd68d0e59044e41e54343a7506970b20d05cc488b83e5a6ccc5f0027627ad1d465276da95a5fdce93b105069d31dbdd8f56e499d8da86710ff7c9ae37417"

RPROVIDES:${PN} += "libmate-slab.so.0()(64bit) \
libmate-slab0 \
libmate-slab0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmate-menu.so.2()(64bit)"

inherit rpm
