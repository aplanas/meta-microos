SUMMARY = "Semigroupoids: Category sans id"
DESCRIPTION = "Provides a wide array of (semi)groupoids and operations for working with them. \
 \
A 'Semigroupoid' is a 'Category' without the requirement of identity arrows for \
every object in the category. \
 \
A 'Category' is any 'Semigroupoid' for which the Yoneda lemma holds. \
 \
When working with comonads you often have the '<*>' portion of an \
'Applicative', but not the 'pure'. This was captured in Uustalu and Vene's \
'Essence of Dataflow Programming' in the form of the 'ComonadZip' class in the \
days before 'Applicative'. Apply provides a weaker invariant, but for the \
comonads used for data flow programming (found in the streams package), this \
invariant is preserved. Applicative function composition forms a semigroupoid. \
 \
Similarly many structures are nearly a comonad, but not quite, for instance \
lists provide a reasonable 'extend' operation in the form of 'tails', but do \
not always contain a value. \
 \
We describe the relationships between the type classes defined in this package \
and those from `base` (and some from `contravariant`) in the diagram below. \
Thick-bordered nodes correspond to type classes defined in this package; \
thin-bordered ones correspond to type classes from elsewhere. Solid edges \
indicate a subclass relationship that actually exists; dashed edges indicate a \
subclass relationship that /should/ exist, but currently doesn't. \
 \
<<https://raw.githubusercontent.com/ekmett/semigroupoids/master/img/classes.svg \
Relationships among type classes from this package and others>> \
 \
Apply, Bind, and Extend (not shown) give rise the Static, Kleisli and Cokleisli \
semigroupoids respectively. \
 \
This lets us remove many of the restrictions from various monad transformers as \
in many cases the binding operation or '<*>' operation does not require them. \
 \
Finally, to work with these weaker structures it is beneficial to have \
containers that can provide stronger guarantees about their contents, so \
versions of 'Traversable' and 'Foldable' that can be folded with just a \
'Semigroup' are added."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-5.3.7-2.10.aarch64.rpm"
RPM_HASH = "6115df3adad13f24452c562db54c01421bdccf9609ccc1bd0e8855c64a3bb8393f82d5c4b13aaf979d36de7863a55f623743672f407d781e4d702c24892e20a5"

RPROVIDES:${PN} += "ghc-semigroupoids \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so"

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
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
