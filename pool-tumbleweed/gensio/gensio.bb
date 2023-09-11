SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types. You \
create a gensio object (or a gensio), and you can use that gensio \
without having to know too much about what is going on underneath. \
You can stack gensio on top of another one to add protocol \
funcionality. For instance, you can create a TCP gensio, stack SSL \
on top of that, and stack Telnet on top of that. It supports a \
number of network I/O and serial ports. gensios that stack on \
other gensios are called filters."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.7.5"

RPM_NAME = "gensio-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "070da7027520271560d4412fc7a09fe5f95d5cd59a39439fe184128cbfdd10dfc49a6dfb2c0cf4950d9c3d7703aa3c31fa65b0107ba8f8d44b66fe7b9ecef8d0"

RPROVIDES:${PN} += "gensio"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgensio.so.6 \
libgensiomdns.so.6 \
libgensioosh.so.6"

inherit rpm
