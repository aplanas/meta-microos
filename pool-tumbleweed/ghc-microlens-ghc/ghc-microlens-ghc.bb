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

RPM_NAME = "ghc-microlens-ghc-0.4.14.1-2.2.aarch64.rpm"
RPM_HASH = "9f15ea247ef49af305312f7bf862022d78463950ced60681667f405b6b4fdde8da50afec2e638e8e9b4cea28c8a77113fe211477638341aa0baf299877ba6289"

RPROVIDES:${PN} += "ghc-microlens-ghc \
ghc-microlens-ghc(aarch-64) \
libHSmicrolens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmicrolens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
