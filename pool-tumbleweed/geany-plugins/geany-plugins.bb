SUMMARY = "A collection of different plugins for Geany"
DESCRIPTION = "Geany-Plugins is a collection of different plugins for Geany, \
a lightweight IDE."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "geany-plugins-1.38-3.6.aarch64.rpm"
RPM_HASH = "782e02c470cfbb26d726312524cfc9ec261d96219d0a52cb9add8aa1dcf656f256df73e67fd1440903d3df77ecf8b0fc1ea5a63c5aa9f039f04f782be72acb98"

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
libgit2.so.1.6 \
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
