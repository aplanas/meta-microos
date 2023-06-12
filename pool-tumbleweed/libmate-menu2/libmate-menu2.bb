SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmate-menu2-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "91175a6dfd7fe30d3e6ad5695331ea97cf22e3d804e861dc78ce586fe466bb64f296b2fd4cf7531110c9244f7adf69466fd5599c8f80cf0926db121be349decd"

RPROVIDES:${PN} += "libmate-menu.so.2()(64bit) \
libmate-menu2 \
libmate-menu2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
