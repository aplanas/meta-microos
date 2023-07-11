SUMMARY = "Libfm libraries"
DESCRIPTION = "libfm main library"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm4-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "f6e05828c9fd8897314d0dd29387135c4f9a96d7d3cb13e66681a90db58fea67495fcd24e6d25f0d6ad58d9138cf52e31fbf38c785ff28204f092a48c4837de1"

RPROVIDES:${PN} += "libfm.so.4 \
libfm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libexif.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3"

inherit rpm
