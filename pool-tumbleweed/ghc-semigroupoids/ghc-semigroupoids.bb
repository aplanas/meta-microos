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

RPM_NAME = "ghc-semigroupoids-5.3.7-2.6.aarch64.rpm"
RPM_HASH = "f1dc9c131153f8192b7f1e3489d4113802d2bc2ba527030bd8220bbbb71826db417938f50cc34dd12fd1418b92e1fb8b1d83032effb2ee7d7381c4e597188cac"

RPROVIDES:${PN} += "ghc-semigroupoids \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
