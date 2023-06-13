SUMMARY = "Simple GObject-based library to parse playlist formats -- Mini Version"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "libxplayer-plparser-mini18-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "74730f0b2496d6e06a268dfa14029362a9c08eb883dc3c7082885c2f3c1d8fb4beb471f9e0db1b385f6b577cebd02037005f077928fddbb36a933f7bfdd1f2bd"

RPROVIDES:${PN} += "libxplayer-plparser-mini.so.18()(64bit) \
libxplayer-plparser-mini18 \
libxplayer-plparser-mini18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
xplayer-plparser"

inherit rpm
