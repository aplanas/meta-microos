SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmana1-47.0-2.2.aarch64.rpm"
RPM_HASH = "67c440abf20f836d1330cdde651deb0c30f961a2053f97d14c9cf629559efdcb824e3b76a93d1a93b801787356731d81f5ee8285f9e996fc95f78d4b8d896807"

RPROVIDES:${PN} += "libmana.so.1 \
libmana1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
