SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet0-0.0.8-1.4.aarch64.rpm"
RPM_HASH = "3871d2b7bc026c589541a171cfa0598ff70fb3bfb7cce458a79b5b5a1c00e30b729196e12f66e40f670efa1b18892b950b1901b268c3d1ac46593a96afece1ee"

RPROVIDES:${PN} += "libuchardet.so.0 \
libuchardet0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
