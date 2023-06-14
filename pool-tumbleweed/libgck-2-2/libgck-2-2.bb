SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgck-2-2-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "1c29af8bb2ebf95896d0d0c4b8547bbdd0028d318917ceb0cf3da11ae061e13f4f37abf820d137706715f7e3a5c8325eaea43eba6e6cad41aa73c15fc670e054"

RPROVIDES:${PN} += "gck \
libgck-2-2 \
libgck-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
