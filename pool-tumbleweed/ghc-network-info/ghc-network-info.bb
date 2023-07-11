SUMMARY = "Access the local computer's basic network configuration"
DESCRIPTION = "This library provides simple read-only access to the local computer's \
networking configuration. It is currently capable of getting a list of all the \
network interfaces and their respective IPv4, IPv6 and MAC addresses. \
 \
network-info has been tested and is known to work on Ubuntu, FreeBSD, NetBSD, \
Mac OS and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "e81951fbc2a0742bded63b71d5e7d9e2f64f7836bb62eb41585e86378f2bbaedd38a7f41f93a40adb8b0d8ab31ac0383f143007aa2ac5e9db36500963b85ccd1"

RPROVIDES:${PN} += "ghc-network-info \
libHSnetwork-info-0.2.1-G9nMDkAKQecAEHIupCmq9I-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
