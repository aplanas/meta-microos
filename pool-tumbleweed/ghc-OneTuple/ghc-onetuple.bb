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

RPM_NAME = "ghc-OneTuple-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "303ab248b52948eedd0c8baef18af2dcca0fafdfd25f269f1bb344a5c2964dd9fe8ebee0248d72b376078e742d0adba825d1efc20298bc1061131bf3c9129b5c"

RPROVIDES:${PN} += "ghc-OneTuple \
libHSOneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
