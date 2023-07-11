SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "This package contain the libzopflipng PNG optimizer library."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopflipng1-1.0.3-2.2.aarch64.rpm"
RPM_HASH = "f93856fe7e92b570b332eadcc9c2d09ca400997bbf93875976f29e4942bb853cbe2dc5c8cc54f6b2567af8a2a170c8f190229fc27bd6690f2c53f79ad5557bcf"

RPROVIDES:${PN} += "libzopflipng.so.1 \
libzopflipng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzopfli.so.1"

inherit rpm
