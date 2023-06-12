SUMMARY = "Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.6"

RPM_NAME = "libmediaart-2_0-0-1.9.6-1.4.aarch64.rpm"
RPM_HASH = "6a202952ec118a47b6abdf457be515f52bad42cc323d73e3c00f1ad49a8b245712318c38cca425501a92d459fb0a0d993d8368499aa0ccbe269221356b4212db"

RPROVIDES:${PN} += "libmediaart-2.0.so.0()(64bit) \
libmediaart-2_0-0 \
libmediaart-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
