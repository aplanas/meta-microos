SUMMARY = "Library exposing some functionality of Haddock"
DESCRIPTION = "Haddock is a documentation-generation tool for Haskell libraries. \
These modules expose some functionality of it without pulling in the GHC \
dependency. Please note that the API is likely to change so be sure to specify \
upper bounds in your projects. For interacting with Haddock itself, see the \
[haddock package](https://hackage.haskell.org/package/haddock)."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-1.11.0-2.3.aarch64.rpm"
RPM_HASH = "c419a69bf451ba7b4b06c2df94e5b8b40193a6b2cdb1a1e3fa3bb7cf1958ade3052856c870b4fc9b18d9ff9ce04e78f3e0eaf3535bd77efd21c65246ad3165c3"

RPROVIDES:${PN} += "ghc-haddock-library \
ghc-haddock-library(aarch-64) \
libHShaddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
