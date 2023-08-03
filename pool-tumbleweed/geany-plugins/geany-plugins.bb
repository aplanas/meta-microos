SUMMARY = "A collection of different plugins for Geany"
DESCRIPTION = "Geany-Plugins is a collection of different plugins for Geany, \
a lightweight IDE."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-1.38-3.7.aarch64.rpm"
RPM_HASH = "82401948196cd268271b20c912c4089a89a1b6972fd157fb14bf2764d7c51eb109ab83cb0ae5f9e40fcfa7a7ad86b5169ccb8856db985e16aa4989edb30be9ac"

RPROVIDES:${PN} += "geany-plugins \
libgeanylua.so \
libgeanypluginutils.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
geany \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgeany.so.0 \
libgio-2.0.so.0 \
libgit2.so.1.7 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libgtkspell3-3.so.0 \
liblua5.1.so.5 \
libpango-1.0.so.0 \
libsoup-2.4.so.1 \
libwebkit2gtk-4.0.so.37 \
libxml2.so.2 \
lua"

inherit rpm
