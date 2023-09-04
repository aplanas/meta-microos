SUMMARY = "Haskell ghc-heap library"
DESCRIPTION = "This package provides the Haskell ghc-heap library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-heap-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "fca7fc665c463f9fd6452106ba93a910e494205ebe26dd4e506e5f30c479ff7d70611be3c7d7317bb5a1a7a0498a6d4e8da25134b8257fab3a8e9ef3f2ca9b50"

RPROVIDES:${PN} += "ghc-ghc-heap \
libHSghc-heap-9.4.6-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
