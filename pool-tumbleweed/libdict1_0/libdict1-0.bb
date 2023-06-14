SUMMARY = "C library of key-value data structures with an object-oriented interface"
DESCRIPTION = "libdict is a C library that provides the following data structures with \
efficient insert, lookup, and delete routines."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libdict1_0-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "beed946fa68448067c2cf1a6c62d5fb037aa4716ebc88cac8f7290f411758025c4d9fd997ec2e062dbdaeb9ed9d8bf6b21c86dbd26b282d149fc6af86e297878"

RPROVIDES:${PN} += "libdict.so.1.0 \
libdict1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
