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

RPM_NAME = "gensio-devel-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "ece3769f2606def1f0a7753822b551529908922d3d20d47cc2f16b0a6ee2d1e3a2052cfd1c456fd49ea81d6b92212f5a85e3003a74b1dd7061c6988f3ff4f8dd"

RPROVIDES:${PN} += "gensio-devel \
gensio-devel(aarch-64) \
pkgconfig(libgensio) \
pkgconfig(libgensio_python_swig) \
pkgconfig(libgensiocpp) \
pkgconfig(libgensiomdns) \
pkgconfig(libgensiomdnscpp) \
pkgconfig(libgensioosh) \
pkgconfig(libgensiooshcpp)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgensio4 \
libgensiocpp4 \
lksctp-tools-devel \
pkgconfig(OpenIPMI) \
pkgconfig(avahi-client)"

inherit rpm
