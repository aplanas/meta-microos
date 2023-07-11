SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "libmd0-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "8c2168e14c14d722cdf7a1b0b3aad9549562538e9acdc02137182e62ad859ebd65328e30922d116d755d30a7ee77b44c5de1219563d15aa0d9bfeee6f5e7ae17"

RPROVIDES:${PN} += "libmd.so.0 \
libmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
