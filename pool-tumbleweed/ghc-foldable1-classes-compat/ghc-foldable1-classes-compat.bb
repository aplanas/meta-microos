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

RPM_NAME = "ghc-foldable1-classes-compat-0.1-2.2.aarch64.rpm"
RPM_HASH = "53dd3d62e5a932b8f26fe3fc294770f57e5aab2c3dc4cdb08fab3cd26594ec5eddf8c7140b2ba6f2e3129ebe71ae00bf5fe18b51e2ad3da4eac0235b0349524f"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
