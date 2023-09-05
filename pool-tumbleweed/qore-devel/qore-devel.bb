SUMMARY = "Header files needed to compile programs using the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides header files needed to compile client programs using the \
Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-devel-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "2644172faad41d1a82a18ee72fa0ec64194fc9b6509696af2a662b9c05de2dc1568541919958e9cd5278a71d708bee3b0ed525cf8444f4f7c4bf2ba4f66a04da"

RPROVIDES:${PN} += "pkgconfig-qore \
qore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm
