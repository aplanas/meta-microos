SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid1-2.39-1.1.aarch64.rpm"
RPM_HASH = "e2657d4bddb04d0c959d03ed7624aeaeb7e8cac8d250f7f7c7ba210b2be72ee4f4d66f951d191ffaabdac92d0a60666e5f7a4ef557332f1c056d3f5962773df3"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
