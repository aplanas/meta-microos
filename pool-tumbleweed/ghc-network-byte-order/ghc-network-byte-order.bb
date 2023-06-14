SUMMARY = "Network byte order utilities"
DESCRIPTION = "Peek and poke functions for network byte order."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "514f3e4e6ccb29fb639d1c9b28b7c685461dd684f595f13e985d17176f4656443bf2c02e4d88b35f4a1bca1c80c6df00b5c2a41ab9eafcd39c7cd928482602e7"

RPROVIDES:${PN} += "ghc-network-byte-order \
libHSnetwork-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
