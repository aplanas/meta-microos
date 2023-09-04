SUMMARY = "Network byte order utilities"
DESCRIPTION = "Peek and poke functions for network byte order."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-0.1.6-4.3.aarch64.rpm"
RPM_HASH = "c434c942cbde095f0565d926e857ae07588fd2ce09d9a01058679b59b822f1613e2c9d7b7bcaf6e64269b554cca61c6476cdf35f53ad32438419b57d04a941d5"

RPROVIDES:${PN} += "ghc-network-byte-order \
libHSnetwork-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
