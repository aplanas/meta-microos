SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types. You \
create a gensio object (or a gensio), and you can use that gensio \
without having to know too much about what is going on underneath. \
You can stack gensio on top of another one to add protocol \
funcionality. For instance, you can create a TCP gensio, stack SSL \
on top of that, and stack Telnet on top of that. It supports a \
number of network I/O and serial ports. gensios that stack on \
other gensios are called filters. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgensio."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "gensio-devel-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "218b34d76b3f7aa73a81f705935524c4365d97e9399c71fc8580369624464346b7d2bf8b66cc0437de6e25c63851f68156cf03ef46c2c87aa07a1030e9704106"

RPROVIDES:${PN} += "gensio-devel \
pkgconfig-libgensio \
pkgconfig-libgensio-python-swig \
pkgconfig-libgensiocpp \
pkgconfig-libgensiomdns \
pkgconfig-libgensiomdnscpp \
pkgconfig-libgensioosh \
pkgconfig-libgensiooshcpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgensio4 \
libgensiocpp4 \
lksctp-tools-devel \
pkgconfig-OpenIPMI \
pkgconfig-avahi-client"

inherit rpm
