SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c1-1.4.1-4.1.aarch64.rpm"
RPM_HASH = "ebebab90b041edb5a10389296bc3e07b38fe0018fc48733792a374b4e274c160c0e45a8234163cf53fd2dd5835a86c1fccfa4fd9f9ce170c860bb776126dda32"

RPROVIDES:${PN} += "libprotobuf-c.so.1 \
libprotobuf-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
