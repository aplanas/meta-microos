SUMMARY = "Libraries for the qore runtime and qore clients"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides the qore library required for all clients using qore \
functionality."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "libqore12-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "e844849262d5bbc5c30a2b9c502623032a030f5137c7760138186e24ea963c88017f812a68b78844361030d222af7df9a864e4d0d6477e291a733ca075955e31"

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
