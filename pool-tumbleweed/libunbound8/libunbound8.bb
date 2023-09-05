SUMMARY = "Shared library from unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the shared library from unbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "libunbound8-1.17.1-2.1.aarch64.rpm"
RPM_HASH = "3a45773c6a70f478e09aa88303756e6d60b2691e3c7561637e8b26954edb2d6068b0fdbd422416d3e051a76d53c51dedae222893286eecf34191eb6e2465ac1c"

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
