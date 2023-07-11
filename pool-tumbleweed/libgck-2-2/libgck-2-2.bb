SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgck-2-2-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "5c73ca00a51a1d32fd52852563d01f1d2605057ec6b24794f90995821aef30a25ca49275bb635f98f28eb2c3dfb72771f49f9ef4accab9767012e809ff3d0f7c"

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
