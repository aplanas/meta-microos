SUMMARY = "Haskell text library"
DESCRIPTION = "This package provides the Haskell text library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "955ddfdd09d52a26537e5380e585763699862ce465dc409396733bd1c6a986dc5d7b273871c1ed771f2f41328ecd29c68659e4b4b67c70b85e48399b7ffd1d4e"

RPROVIDES:${PN} += "ghc-text \
libHStext-2.0.2-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
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
