SUMMARY = "Shared library from unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the shared library from unbound."
LICENSE = "BSD-3-Clause"

PV = "1.18.0"

RPM_NAME = "libunbound8-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "6d04c1d942a3496941131cdebeebaa62511f7538fbd890c636dfd03fc8ea18d169051df6d4fa5355f985d301da461e6f9a5ee81df3eee4d0a6ec8a8ab95f98fe"

RPROVIDES:${PN} += "libunbound.so.8 \
libunbound8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libnghttp2.so.14 \
libprotobuf-c.so.1 \
libpython3.11.so.1.0 \
libsodium.so.23 \
libssl.so.3 \
unbound-anchor"

inherit rpm
