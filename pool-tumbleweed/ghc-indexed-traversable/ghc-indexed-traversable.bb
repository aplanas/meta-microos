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

RPM_NAME = "ghc-indexed-traversable-0.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "13d0d63f168a3f9837392236f07c013010e985e0cedaf1ec3cc706d00464f94b78fdafcc66394eb089367c260051d420535e048e68ff896e66700284eca690da"

RPROVIDES:${PN} += "ghc-indexed-traversable \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
