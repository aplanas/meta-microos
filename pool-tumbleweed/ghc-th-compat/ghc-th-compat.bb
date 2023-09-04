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

RPM_NAME = "ghc-th-compat-0.1.4-3.1.aarch64.rpm"
RPM_HASH = "0d5fcf0098a936af23d11323fb0d62bdb5f11f5a61c7fd66991a7dfd9e369e296826490537ada0a29ebd9b5505db7fbcef3b5655f5146666a39a5290a1811bc8"

RPROVIDES:${PN} += "ghc-th-compat \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
