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

PV = "2.6.1"

RPM_NAME = "gensio-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "22af987659467797194af80b2844f0f98b0508819699432a1055925df9ae449a690d83afe3a4d0bca843018fe513932ed04ecc53f5a5dea4516d56e55dd34258"

RPROVIDES:${PN} += "gensio gensio(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgensio.so.4()(64bit) libgensiomdns.so.0()(64bit) libgensioosh.so.0()(64bit)"

inherit rpm
