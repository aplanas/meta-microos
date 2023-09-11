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

PV = "2.7.5"

RPM_NAME = "gensio-devel-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "f862589a14e8bcb22d9756dbd8bcfafbc6b71fa8156d5a71c33a8e1db57a9508200cc497a5a93ff71cfbc7655dd02be823d66142ed2cc5f89524bae9fa432be9"

RPROVIDES:${PN} += "gensio-devel \
pkgconfig-libgensio \
pkgconfig-libgensio-python-swig \
pkgconfig-libgensiocpp \
pkgconfig-libgensiomdns \
pkgconfig-libgensiomdnscpp \
pkgconfig-libgensioosh \
pkgconfig-libgensiooshcpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgensio6 \
libgensiocpp6 \
lksctp-tools-devel \
pkgconfig-OpenIPMI \
pkgconfig-avahi-client"

inherit rpm
