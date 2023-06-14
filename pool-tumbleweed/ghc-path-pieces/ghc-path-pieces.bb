SUMMARY = "Components of paths"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/path-pieces>."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-0.2.1-12.2.aarch64.rpm"
RPM_HASH = "d2cf2d56bd4dfebce3b3cf3fb3a13808c0d848259f2ff827c2c599a244b57b57a4dd6a696db07fab7c64b41782cf0d7958559a3c067e6257e72196c73422b3fa"

RPROVIDES:${PN} += "ghc-path-pieces \
libHSpath-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
