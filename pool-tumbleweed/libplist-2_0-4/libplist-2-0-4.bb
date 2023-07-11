SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libplist-2_0-4-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "ddba07be68dc1ca82985d140241a493c8ed712e5120b8e94f5458caabb7fd0c9b44ddd95d707c59c3464cf4e7322b48c1fabe89d92c70ab3c15d5b059d4c1712"

RPROVIDES:${PN} += "libplist-2-0-4 \
libplist-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
