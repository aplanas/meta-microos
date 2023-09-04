SUMMARY = "Singleton Tuple"
DESCRIPTION = "This package is a compatibility package for a singleton data type \
 \
> data Solo a = MkSolo a \
 \
Note: it's not a 'newtype' \
 \
'Solo' is available in 'base-4.16' (GHC-9.2)."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "0a5641c72b2382e7ba8d84e42459ae344b928c87d9dca27a2659c362de31614d1f7555a3241d1836769136fd23534337e68fcc540655dc7b6d03860a8e91ee78"

RPROVIDES:${PN} += "ghc-OneTuple \
libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so"

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
