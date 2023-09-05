SUMMARY = "Unbound Anchor cert management tools"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package contains the tools to manage the anchor certs."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-anchor-1.17.1-2.1.aarch64.rpm"
RPM_HASH = "a3ed7d2b866787e95784bc5f63ca143a89c0764eeeb8703599f5942ea7e797268f91b797bacfa9077495fa1ae35d2727e468283bc3f2d9a1935b5a547bfaa6e2"

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
