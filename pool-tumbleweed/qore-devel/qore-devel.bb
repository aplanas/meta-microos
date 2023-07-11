SUMMARY = "Header files needed to compile programs using the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides header files needed to compile client programs using the \
Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-devel-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "7e881491d7d50baa82d4b41029aaa8d9db31c831ae5b038fa9fa7040daa0b1917a4308daa99761bc3fdb1b73d7f3e7dace5a67dae4882ed61784a18df4ba15aa"

RPROVIDES:${PN} += "pkgconfig-qore \
qore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm
