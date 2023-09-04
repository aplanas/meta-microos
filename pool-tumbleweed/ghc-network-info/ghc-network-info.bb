SUMMARY = "Access the local computer's basic network configuration"
DESCRIPTION = "This library provides simple read-only access to the local computer's \
networking configuration. It is currently capable of getting a list of all the \
network interfaces and their respective IPv4, IPv6 and MAC addresses. \
 \
network-info has been tested and is known to work on Ubuntu, FreeBSD, NetBSD, \
Mac OS and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "66288762bc3e6f7d6e3890def3b8ce7ad9b535502237808ab920df431d011b2c23ae7f39cf663a81709316582e86cc81d76c29531d3e108c5aa004eb5718f56b"

RPROVIDES:${PN} += "ghc-network-info \
libHSnetwork-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
