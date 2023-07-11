SUMMARY = "Compatibility package for the Foldable1 and Bifoldable1 type classes"
DESCRIPTION = "A compatibility package for the 'Foldable1' and 'Bifoldable1' type classes, \
which were introduced in 'base-4.18.0.0' (GHC 9.6.1). For more information, see \
<https://github.com/haskell/core-libraries-committee/issues/9 this Core \
Libraries Committee proposal>. \
 \
'Foldable1' and 'Bifoldable1' classify non-empty data structures that can be \
folded to a summary value."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-0.1-1.3.aarch64.rpm"
RPM_HASH = "d65c4c6bb561e2a116d0fcadd63568285108a8ae9f1df6c0a77481bbeb6ea29a29a79d12f87bb0f16a812da303f567214821d78451eaf4a1c306d8164d3bd9f1"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
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
