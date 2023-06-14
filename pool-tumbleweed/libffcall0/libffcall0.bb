SUMMARY = "Libraries for foreign function call interfaces"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libffcall0-2.4-2.7.aarch64.rpm"
RPM_HASH = "ca8a51eafff6329c70c120bde566ed6caca20d3e7752a7dc056aa1e86755b63238492b441c58e3fee48a7d3d90aad378f26f5636e46fbe1b614646b9a1c2f958"

RPROVIDES:${PN} += "libffcall.so.0 \
libffcall0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
