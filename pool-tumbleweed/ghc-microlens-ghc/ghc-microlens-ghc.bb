SUMMARY = "Microlens + array, bytestring, containers, transformers"
DESCRIPTION = "Use this package instead of <http://hackage.haskell.org/package/microlens \
microlens> if you don't mind depending on all dependencies here – \
'Lens.Micro.GHC' reexports everything from 'Lens.Micro' and additionally \
provides orphan instances of microlens classes for packages coming with GHC \
(<http://hackage.haskell.org/package/array array>, \
<http://hackage.haskell.org/package/bytestring bytestring>, \
<http://hackage.haskell.org/package/containers containers>, \
<http://hackage.haskell.org/package/transfromers transformers>). \
 \
The minor and major versions of microlens-ghc are incremented whenever the \
minor and major versions of microlens are incremented, so you can depend on the \
exact version of microlens-ghc without specifying the version of microlens you \
need. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme <https://github.com/monadfix/microlens#readme \
on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-0.4.14.1-2.3.aarch64.rpm"
RPM_HASH = "04829b10159b6067c1b14404771390b0122008497a370e770e3fe9681b14460a80a4b23f3487a8c2a7495ce2ae1e639142821f625e3b3256144f2dc480aa9540"

RPROVIDES:${PN} += "ghc-microlens-ghc \
libHSmicrolens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
