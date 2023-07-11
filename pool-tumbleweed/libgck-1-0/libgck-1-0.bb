SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgck-1-0-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "b54d8079599920b379f31337e2f8d6593ee0a85f99710bec596e9c011ecd3a1e4a9022e2d35e8354314d63e24037a4cb1e53322e9744691647e581ce56327e40"

RPROVIDES:${PN} += "gck \
libgck-1-0 \
libgck-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
