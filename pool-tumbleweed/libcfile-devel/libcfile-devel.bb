SUMMARY = "Development files for libcfile, a C file library"
DESCRIPTION = "A library for C file functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcfile."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile-devel-20220106-2.6.aarch64.rpm"
RPM_HASH = "13ef536a1af3b30e87c520d3cef0a55b8a32ac42c3b17dc46695db9de2d86adcb497b144c9e52ab4a783469f3daa97fbec1405cdfd0318c84eb3ee2f8ec26ed1"

RPROVIDES:${PN} += "libcfile-devel \
pkgconfig-libcfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfile1"

inherit rpm
