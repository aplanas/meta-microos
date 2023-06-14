SUMMARY = "Lenses, Folds and Traversals"
DESCRIPTION = "This package comes 'Batteries Included' with many useful lenses for the types \
commonly used from the Haskell Platform, and with tools for automatically \
generating lenses and isomorphisms for user-supplied data types. \
 \
The combinators in 'Control.Lens' provide a highly generic toolbox for \
composing families of getters, folds, isomorphisms, traversals, setters and \
lenses and their indexed variants. \
 \
An overview, with a large number of examples can be found in the \
<https://github.com/ekmett/lens#lens-lenses-folds-and-traversals README>. \
 \
An introductory video on the style of code used in this library by Simon Peyton \
Jones is available from \
<http://skillsmatter.com/podcast/scala/lenses-compositional-data-access-and-manipulation \
Skills Matter>. \
 \
A video on how to use lenses and how they are constructed is available on \
<http://youtu.be/cefnmjtAolY?hd=1 youtube>. \
 \
Slides for that second talk can be obtained from \
<http://comonad.com/haskell/Lenses-Folds-and-Traversals-NYC.pdf comonad.com>. \
 \
More information on the care and feeding of lenses, including a brief tutorial \
and motivation for their types can be found on the \
<https://github.com/ekmett/lens/wiki lens wiki>. \
 \
A small game of 'pong' and other more complex examples that manage their state \
using lenses can be found in the \
<https://github.com/ekmett/lens/blob/master/examples/ example folder>. \
 \
/Lenses, Folds and Traversals/ \
 \
With some signatures simplified, the core of the hierarchy of lens-like \
constructions looks like: \
 \
<<http://i.imgur.com/ALlbPRa.png>> \
 \
<https://raw.githubusercontent.com/ekmett/lens/master/images/Hierarchy.png \
(Local Copy)> \
 \
You can compose any two elements of the hierarchy above using '(.)' from the \
'Prelude', and you can use any element of the hierarchy as any type it linked \
to above it. \
 \
The result is their lowest upper bound in the hierarchy (or an error if that \
bound doesn't exist). \
 \
For instance: \
 \
* You can use any 'Traversal' as a 'Fold' or as a 'Setter'. \
 \
* The composition of a 'Traversal' and a 'Getter' yields a 'Fold'. \
 \
/Minimizing Dependencies/ \
 \
If you want to provide lenses and traversals for your own types in your own \
libraries, then you can do so without incurring a dependency on this (or any \
other) lens package at all. \
 \
/e.g./ for a data type: \
 \
> data Foo a = Foo Int Int a \
 \
You can define lenses such as \
 \
> -- bar :: Lens' (Foo a) Int > bar :: Functor f => (Int -> f Int) -> Foo a -> \
f (Foo a) > bar f (Foo a b c) = fmap (a' -> Foo a' b c) (f a) \
 \
> -- quux :: Lens (Foo a) (Foo b) a b > quux :: Functor f => (a -> f b) -> Foo \
a -> f (Foo b) > quux f (Foo a b c) = fmap (Foo a b) (f c) \
 \
without the need to use any type that isn't already defined in the 'Prelude'. \
 \
And you can define a traversal of multiple fields with \
'Control.Applicative.Applicative': \
 \
> -- traverseBarAndBaz :: Traversal' (Foo a) Int > traverseBarAndBaz :: \
Applicative f => (Int -> f Int) -> Foo a -> f (Foo a) > traverseBarAndBaz f \
(Foo a b c) = Foo <$> f a <*> f b <*> pure c \
 \
What is provided in this library is a number of stock lenses and traversals for \
common haskell types, a wide array of combinators for working them, and more \
exotic functionality, (/e.g./ getters, setters, indexed folds, isomorphisms)."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-5.2.2-1.3.aarch64.rpm"
RPM_HASH = "17da02c1b0b62631a425c85d77a7becf704eecf1e93db33c09d6dbb294b81da22878912d47695c4b2c914bd729317c22255dfce2ff60ff5c5f10dd7f87083228"

RPROVIDES:${PN} += "ghc-lens \
libHSlens-5.2.2-2MO0prnPqCQBRfua8fH2Ea-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSadjunctions-4.4.2-7RBwcclil4HKBSm6i086HA-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfree-5.1.10-7AdTZukDGhL7qWMpdopXbC-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO-ghc9.4.5.so \
libHSinvariant-0.6.1-B19sct74tP6Cqvpbmm6WZv-ghc9.4.5.so \
libHSkan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprofunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV-ghc9.4.5.so \
libHSreflection-2.1.7-KcOWE7PS1mHy6gA2edHvV-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsemigroups-0.20-KtsaS4jNcGkoC9puVZ6vB-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSvoid-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
