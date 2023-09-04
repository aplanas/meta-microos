SUMMARY = "Monads for free"
DESCRIPTION = "Free monads are useful for many tree-like structures and domain specific \
languages. \
 \
If 'f' is a 'Functor' then the free 'Monad' on 'f' is the type of trees whose \
nodes are labeled with the constructors of 'f'. The word 'free' is used in the \
sense of 'unrestricted' rather than 'zero-cost': 'Free f' makes no constraining \
assumptions beyond those given by 'f' and the definition of 'Monad'. \
As used here it is a standard term from the mathematical theory of adjoint \
functors. \
 \
Cofree comonads are dual to free monads. They provide convenient ways to talk \
about branching streams and rose-trees, and can be used to annotate syntax \
trees. The cofree comonad can be seen as a stream parameterized by a 'Functor' \
that controls its branching factor. \
 \
More information on free monads, including examples, can be found in the \
following blog posts: <http://comonad.com/reader/2008/monads-for-free/> \
<http://comonad.com/reader/2011/free-monads-for-less/>."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-5.1.10-2.9.aarch64.rpm"
RPM_HASH = "85eceb85daa9542a1310de74f74e1518ffacfbe29c676618cea8de12786bb8011bc13711caa0cd3b327d9996d6960b428bc09d19a5d414198d36a25da79c883e"

RPROVIDES:${PN} += "ghc-free \
libHSfree-5.1.10-8DOWW3JiZaX7obxPZwBWX0-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprofunctors-5.6.2-GfNUFxHNpLn859duquR0iv-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
