SUMMARY = "FunctorWithIndex, FoldableWithIndex, TraversableWithIndex"
DESCRIPTION = "This package provides three useful generalizations: \
 \
' class Functor f => FunctorWithIndex i f | f -> i where imap :: (i -> a -> b) \
-> f a -> f b ' \
 \
' class Foldable f => FoldableWithIndex i f | f -> i where ifoldMap :: Monoid m \
=> (i -> a -> m) -> f a -> m ' \
 \
' class (FunctorWithIndex i t, FoldableWithIndex i t, Traversable t) => \
TraversableWithIndex i t | t -> i where itraverse :: Applicative f => (i -> a \
-> f b) -> t a -> f (t b) ' \
 \
This package contains instances for types in GHC boot libraries. For some \
additional instances see \
[indexed-traversable-instances](https://hackage.haskell.org/package/indexed-traversable-instances). \
 \
The [keys](https://hackage.haskell.org/package/keys) package provides similar \
functionality, but uses (associated) 'TypeFamilies' instead of \
'FunctionalDependencies'."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-0.1.2.1-1.2.aarch64.rpm"
RPM_HASH = "4afa1eba73b2cab83798e29b931088ca6bc617b95b6c3911904c54912c3888f671eeef1390419e606068dd792ab58811c429a4988c93d8cb7bdf65b2314806e2"

RPROVIDES:${PN} += "ghc-indexed-traversable ghc-indexed-traversable(aarch-64) libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
