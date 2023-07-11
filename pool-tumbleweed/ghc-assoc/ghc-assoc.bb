SUMMARY = "Swap and assoc: Symmetric and Semigroupy Bifunctors"
DESCRIPTION = "Provides generalisations of 'swap :: (a,b) -> (b,a)' and 'assoc :: ((a,b),c) -> \
(a,(b,c))' to 'Bifunctor's supporting similar operations (e.g. \
'Either', 'These')."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-1.1-1.3.aarch64.rpm"
RPM_HASH = "b2813c7aa9d51902c167efc930b73b7f2ce1c884ba1ce64c6c561df7e2e6b48268351fc5f546d26a7a21c494d53cd905dae7795caaf0b58930f3e8bda57fe0d8"

RPROVIDES:${PN} += "ghc-assoc \
libHSassoc-1.1-H3gdf0Ue1d5sn9822dJ4G-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
