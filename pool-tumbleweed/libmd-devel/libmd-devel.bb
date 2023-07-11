SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "libmd-devel-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "82e2af48d178b78d5075ad6057ff61b5bed05711efe147d5619c59d7f9c062eebd61f3b3dcc455a6d7837d0fc463911a158f1802a08e1f004411e1ef135034ae"

RPROVIDES:${PN} += "libmd-devel \
pkgconfig-libmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmd0"

inherit rpm
