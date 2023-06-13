SUMMARY = "A collection of different plugins for Geany"
DESCRIPTION = "Geany-Plugins is a collection of different plugins for Geany, \
a lightweight IDE."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-1.38-3.5.aarch64.rpm"
RPM_HASH = "5c1a7dc178dec2198e6f749e39d8f4f4838807c8f0153b8526f0ba938cab1c90218134b80f14f94b03bda1bb01853735e7add880fb221a2c5ef4d65efdd235b5"

RPROVIDES:${PN} += "geany-plugins \
geany-plugins(aarch-64) \
libgeanylua.so()(64bit) \
libgeanypluginutils.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
geany \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgeany.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgit2.so.1.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libgtk-3.so.0()(64bit) \
libgtkspell3-3.so.0()(64bit) \
liblua5.1.so.5()(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
lua"

inherit rpm
