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

RPM_NAME = "libgensiocpp4-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "cc29f8b46fe7bec6f279d9aff1f1699dc5b7eec0997ea723e3ea24b6cecf8447578513694143b3e4792a4ef40a5fc78c4849621d6547241fe763771e14720e23"

RPROVIDES:${PN} += "libgensiocpp.so.4 \
libgensiocpp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio.so.4 \
libgensioosh.so.0 \
libgensiooshcpp.so.0 \
libstdc++.so.6"

inherit rpm
