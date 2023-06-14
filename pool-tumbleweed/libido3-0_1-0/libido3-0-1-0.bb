SUMMARY = "Shared library providing extra GTK+ menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "libido3-0_1-0-13.10.0+bzr20161028-3.16.aarch64.rpm"
RPM_HASH = "e812bc9f5d81c244df61356d4b16cadd3bd95ae6a91a1d20782ad5c0a933d1234587da803d23b095d43b416454319c2f6d8397b44b6647fbef47158bf3d2ccf0"

RPROVIDES:${PN} += "libido3-0-1-0 \
libido3-0.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
