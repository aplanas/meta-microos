SUMMARY = "Unbound Anchor cert management tools"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package contains the tools to manage the anchor certs."
LICENSE = "BSD-3-Clause"

PV = "1.18.0"

RPM_NAME = "unbound-anchor-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "7f26011b2cb0ac048deed6c1fddf22fe6f6dede6ce993e3e21dd33732e41189174df2ab6c519e76012b13b2cdad6621658da69f3cdd7430117ea24da14396e41"

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
