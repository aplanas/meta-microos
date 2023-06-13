SUMMARY = "X Rendering Extension library"
DESCRIPTION = "The Xrender library is designed as a lightweight library interface to \
the Render extension."
LICENSE = "MIT"

PV = "0.9.11"

RPM_NAME = "libXrender1-0.9.11-1.2.aarch64.rpm"
RPM_HASH = "b2359be8c2b88900e60f9ecde97156f9e4baf3c172e643e6fa1b00793cbbe7faf570d3cfc5a2a9ea6ae0cb8dfe8bcbcae3bbbf629c57672645f1fc76254689ab"

RPROVIDES:${PN} += "libXrender.so.1()(64bit) \
libXrender1 \
libXrender1(aarch-64) \
xorg-x11-libXrender"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
