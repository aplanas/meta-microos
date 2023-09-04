SUMMARY = "Haskell deepseq library"
DESCRIPTION = "This package provides the Haskell deepseq library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "19b41a02fc00a2f36dad6535cf8612d885585cb45e0c7bbc0e72f89cfc0eb2a0fc8371a8f3c212f0cd6e95a9b19772f40d2afa76aaf8034479f39e5c154a405a"

RPROVIDES:${PN} += "ghc-deepseq \
libHSdeepseq-1.4.8.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
