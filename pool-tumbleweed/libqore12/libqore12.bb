SUMMARY = "Libraries for the qore runtime and qore clients"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides the qore library required for all clients using qore \
functionality."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "libqore12-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "44607ed73d68f4d1dd709dda09d0bbf7c16d2c4e2621835c2996a2bfde6c4776344e2c97503b6ea71bee87188e1b0e53288f0be15ce4e2d20e07d7256c3bf221"

RPROVIDES:${PN} += "libqore.so.12 \
libqore12 \
qore-module-abi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmpfr.so.6 \
libpcre.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
