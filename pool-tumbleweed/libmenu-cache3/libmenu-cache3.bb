SUMMARY = "Menu-cache libraries"
DESCRIPTION = "menu-cache libraries for development"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmenu-cache3-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "dbcd034da13d2b6ae46875a7b490914ab094237f63cc61161339234f75d24012979ef20e816fa692f6edde2a7fdf4ce48b07b04a7f4365bf87aaba7ce288c395"

RPROVIDES:${PN} += "libmenu-cache.so.3 \
libmenu-cache3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
