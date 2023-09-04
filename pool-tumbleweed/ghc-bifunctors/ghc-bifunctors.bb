SUMMARY = "Collection Haskell 98 bifunctors, bifoldables and bitraversables"
DESCRIPTION = "Bifunctor, bifoldable, and bitraversable instances for Haskell 98."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-5.5.15-1.9.aarch64.rpm"
RPM_HASH = "04e464cb4acb17198513d8d906bdb1d0f90ce309f1ccff6d680294122457adf27f83d3dbe3a9d58c5d465eae0ba1abce2f9ce89a3545b478dd44fec6f9e9afa2"

RPROVIDES:${PN} += "ghc-bifunctors \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
