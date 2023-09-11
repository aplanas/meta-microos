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

PV = "5.2.3"

RPM_NAME = "ghc-lens-5.2.3-1.1.aarch64.rpm"
RPM_HASH = "6481b3942b2b0357aadb8a0517b72a8096d866632392bbe1b7b86c7fdacd0375cbf2199f216aa838aee841a9d1fa0179d5bae452889957f296e3a2bc1c51f4f1"

RPROVIDES:${PN} += "ghc-lens \
libHSlens-5.2.3-77wBUrzlfuWHQNAaqkfvdZ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSadjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSfree-5.1.10-8DOWW3JiZaX7obxPZwBWX0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinvariant-0.6.2-1eF4QVqz69AFovgmNz4wk7-ghc9.4.6.so \
libHSkan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprofunctors-5.6.2-GfNUFxHNpLn859duquR0iv-ghc9.4.6.so \
libHSreflection-2.1.7-1WygFxHmxkcEQBv8T6gHut-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSsemigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSvoid-0.7.3-GhXmDKlBHl0LbXoxVMxAU0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
