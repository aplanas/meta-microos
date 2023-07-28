SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "libharfbuzz0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "6d76ed2d364151514b4de5ec2e73df06bf1315e19d52e78081e5ea1d74f60898a43fbb03278684e171579d3edbf38480f42290d3e314fb5a225cde7da2c739c2"

RPROVIDES:${PN} += "libharfbuzz.so.0 \
libharfbuzz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgraphite2.so.3 \
libm.so.6"

inherit rpm
