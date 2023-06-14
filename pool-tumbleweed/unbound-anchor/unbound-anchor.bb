SUMMARY = "Unbound Anchor cert management tools"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package contains the tools to manage the anchor certs."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-anchor-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "41685ab65a93b0965840bf13d205717cac33df4c3fd60f57e9fd8b93414ae08c168074c6ab7101585f657cb161669d15d460b06c6b87074c7344fa2d8131cdde"

RPROVIDES:${PN} += "config-unbound-anchor \
group-unbound \
unbound-anchor \
user-unbound"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libssl.so.3 \
libunbound.so.8 \
sysuser-shadow"

inherit rpm
