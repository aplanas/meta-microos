SUMMARY = "Mini version of the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "libtotem-plparser-mini18-3.26.6-2.8.aarch64.rpm"
RPM_HASH = "b1f3b43867d975753e7036deb5f3505d9af8c6050ed3f523fa402dfeffc1ca650a547a5fd888aeaecea6b9509ff251e3b39b614ca6496ad847292d077bcd51dc"

RPROVIDES:${PN} += "libtotem-plparser-mini.so.18()(64bit) \
libtotem-plparser-mini.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) \
libtotem-plparser-mini18 \
libtotem-plparser-mini18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
totem-pl-parser"

inherit rpm
