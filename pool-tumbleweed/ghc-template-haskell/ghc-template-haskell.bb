SUMMARY = "Haskell template-haskell library"
DESCRIPTION = "This package provides the Haskell template-haskell library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "7b7ed6b4646556757f50250829e8511328530a5b84e7335fe3f6d4f94c0c1939aeea4ed1fa7668d7ca6a3304bb42dd3b96b336048cbd1789d727bfc739d955cc"

RPROVIDES:${PN} += "ghc-template-haskell \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
