SUMMARY = "Backward- (and forward-)compatible Quote and Code types"
DESCRIPTION = "This package defines a 'Language.Haskell.TH.Syntax.Compat' module, which \
backports the 'Quote' and 'Code' types to work across a wide range of \
'template-haskell' versions. The 'makeRelativeToProject' utility is also \
backported. On recent versions of 'template-haskell' (2.17.0.0 or later), this \
module simply reexports definitions from 'Language.Haskell.TH.Syntax'. \
Refer to the Haddocks for 'Language.Haskell.TH.Syntax.Compat' for examples of \
how to use this module."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "0da89c861a45331f3687b8fd1a9ed7e403d168a9aa956b9dc8a2d9a082548dc0c5abbb83ead1769d9302f590261e5297a8fe5b803fb2e0a662d39dea00a0d3cf"

RPROVIDES:${PN} += "ghc-th-compat \
ghc-th-compat(aarch-64) \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
