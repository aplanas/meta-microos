SUMMARY = "Library exposing some functionality of Haddock"
DESCRIPTION = "Haddock is a documentation-generation tool for Haskell libraries. \
These modules expose some functionality of it without pulling in the GHC \
dependency. Please note that the API is likely to change so be sure to specify \
upper bounds in your projects. For interacting with Haddock itself, see the \
[haddock package](https://hackage.haskell.org/package/haddock)."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-1.11.0-2.6.aarch64.rpm"
RPM_HASH = "e3cc6600ae20d54d050793f8a577066d7215a975dec8f6fee74fa59797c2eeb1d5fcdc97262ffd33523bdbd019047c119c07b75895d88733ca47bb31740cb578"

RPROVIDES:${PN} += "ghc-haddock-library \
libHShaddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
