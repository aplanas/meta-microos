SUMMARY = "Samba talloc library"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
This package includes the talloc2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "libtalloc2-2.4.0-3.2.aarch64.rpm"
RPM_HASH = "82521fa74cd784d3355cd44c979ebb87f4fcfb1696e5c1e9d977037a937f72b505df33dca95d024cb3b7dcc28545938a0bbf26c776d7836ac5d4f5e9d0b7b040"

RPROVIDES:${PN} += "bundled-libreplace \
libtalloc.so.2 \
libtalloc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
