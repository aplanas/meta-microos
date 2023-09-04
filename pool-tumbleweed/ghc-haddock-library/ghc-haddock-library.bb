SUMMARY = "Library exposing some functionality of Haddock"
DESCRIPTION = "Haddock is a documentation-generation tool for Haskell libraries. \
These modules expose some functionality of it without pulling in the GHC \
dependency. Please note that the API is likely to change so be sure to specify \
upper bounds in your projects. For interacting with Haddock itself, see the \
[haddock package](https://hackage.haskell.org/package/haddock)."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-1.11.0-2.8.aarch64.rpm"
RPM_HASH = "fb7cd6f21aa0dc1d556a72353afeda9d7f591c3aefb7c1d73b7730e821e91be986939db9b3f9321480b2d0d1d8e713427ea960c4b3c411245344ff052a089f2b"

RPROVIDES:${PN} += "ghc-haddock-library \
libHShaddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
