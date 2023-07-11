SUMMARY = "Unbound Anchor cert management tools"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package contains the tools to manage the anchor certs."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-anchor-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "59344b2c25a16e9691c10d90aa350cc9608ed5831358bb489e17973dec62a2c678caebd82845cac25cd6a975b4633efb778db491704d1fb3d14fa2ccb28a8404"

RPROVIDES:${PN} += "config-unbound-anchor \
group-unbound \
unbound-anchor \
user-unbound"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libssl.so.3 \
libunbound.so.8 \
sysuser-shadow"

inherit rpm
