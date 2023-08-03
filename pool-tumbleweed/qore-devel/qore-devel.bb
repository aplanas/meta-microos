SUMMARY = "Header files needed to compile programs using the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides header files needed to compile client programs using the \
Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-devel-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "3f0727a33dc4cee6a06d272cf4691b3c685babb2b0b72c718f15ab3f566f30a36186468551d89e25957890aba2bb7ae7cdb0a3b56ed67f0c150b9ab670b2d6b2"

RPROVIDES:${PN} += "pkgconfig-qore \
qore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm
