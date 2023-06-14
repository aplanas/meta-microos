SUMMARY = "A simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "libxplayer-plparser18-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "62cc3c5349f0d959396c1c743f242c1ba65145c4562c812b49fb65b9346930fb33788e6df41f2da77de034af8cc6395397968f53b40542a04154804c31e3e154"

RPROVIDES:${PN} += "libxplayer-plparser.so.18 \
libxplayer-plparser18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2 \
xplayer-plparser"

inherit rpm
