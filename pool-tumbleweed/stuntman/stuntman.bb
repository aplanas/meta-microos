SUMMARY = "STUN server and client"
DESCRIPTION = "An implementation of the STUN protocol (Session Traversal Utilities \
for NAT) as specified in RFCs 5389, 5769, and 5780. It also includes \
backwards compatibility for RFC 3489. \
This package provides an STUN server and client application."
LICENSE = "Apache-2.0"

PV = "1.2.16"

RPM_NAME = "stuntman-1.2.16-2.11.aarch64.rpm"
RPM_HASH = "71eab121793f9896148b3c1dd5efa69fd3f4fe71c55bf0b31ac1788a584de312286058b8f3cae26147be5a896aa03abdcc8e397eb023cb5b589d28a22b17a71b"

RPROVIDES:${PN} += "stuntman"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
shadow"

inherit rpm
