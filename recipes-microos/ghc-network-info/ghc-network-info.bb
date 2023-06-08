SUMMARY = "Access the local computer's basic network configuration"
DESCRIPTION = "This library provides simple read-only access to the local computer's \
networking configuration. It is currently capable of getting a list of all the \
network interfaces and their respective IPv4, IPv6 and MAC addresses. \
 \
network-info has been tested and is known to work on Ubuntu, FreeBSD, NetBSD, \
Mac OS and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "2e79ed55a80639e8d65e08cbfc653dfe3f6e3cd38a434650ea0afa7b5ed1616fafd7c62052eb3cb6c210c930d52ba275561553c564955b428a2e425a6f13a0c8"

RPROVIDES:${PN} += "ghc-network-info ghc-network-info(aarch-64) libHSnetwork-info-0.2.1-G9nMDkAKQecAEHIupCmq9I-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
