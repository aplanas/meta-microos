SUMMARY = "GNOME Binary Editor -- Library"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "libgtkhex-4-1-44.2-1.1.aarch64.rpm"
RPM_HASH = "d70192e139ee21405bd693f24d282dbb121bced8d7ae4973f475301461c2d6f54340651337d7881e53cec6fb2679578bc01f384c12997821816ef3c37884eeb8"

RPROVIDES:${PN} += "libgtkhex-4-1 \
libgtkhex-4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
