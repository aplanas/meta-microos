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

RPM_NAME = "libgensiocpp6-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "685efd7b86978850f61c74ccaa5f9dd89d771a5f2ea2e4222d6f8aacc495107bae5ab7f14295dcbf7ec0b11468b41372c45bd76a600db35de03e7fc620875ee7"

RPROVIDES:${PN} += "libgensiocpp.so.6 \
libgensiocpp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio.so.6 \
libgensioosh.so.6 \
libgensiooshcpp.so.6 \
libstdc++.so.6"

inherit rpm
