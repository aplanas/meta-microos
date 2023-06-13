SUMMARY = "A simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "libxplayer-plparser18-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "62cc3c5349f0d959396c1c743f242c1ba65145c4562c812b49fb65b9346930fb33788e6df41f2da77de034af8cc6395397968f53b40542a04154804c31e3e154"

RPROVIDES:${PN} += "libxplayer-plparser.so.18()(64bit) \
libxplayer-plparser18 \
libxplayer-plparser18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmime-3.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit) \
xplayer-plparser"

inherit rpm
