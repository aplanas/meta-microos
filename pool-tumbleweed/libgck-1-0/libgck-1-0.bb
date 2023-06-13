SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgck-1-0-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "a696c1a273b65964dab4b64339c72a0800480a9c4e61f6d85f7c87eaef2567cdb60d6d6e83c3d6bf8320433ada0f26d888885c1ecea69183609d7e3d5f2ba63b"

RPROVIDES:${PN} += "gck \
libgck-1-0 \
libgck-1-0(aarch-64) \
libgck-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libp11-kit.so.0()(64bit)"

inherit rpm
