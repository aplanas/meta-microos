SUMMARY = "Extra functions I use"
DESCRIPTION = "A library of extra functions for the standard Haskell libraries. Most functions \
are simple additions, filling out missing functionality. A few functions are \
available in later versions of GHC, but this package makes them available back \
to GHC 7.2. \
 \
The module 'Extra' documents all functions provided by this library. \
Modules such as 'Data.List.Extra' provide extra functions over 'Data.List' and \
also reexport 'Data.List'. Users are recommended to replace 'Data.List' imports \
with 'Data.List.Extra' if they need the extra functionality."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-1.7.14-1.2.aarch64.rpm"
RPM_HASH = "d34c941bddd662655002c8faf37e2e463232042878930ee0e94b0d5097cd488cf0ec6646e10b376c88611d15f37f299277e74094ade681a992d764b79294037b"

RPROVIDES:${PN} += "ghc-extra \
libHSextra-1.7.14-9MsHIUa0FAo4DKg07m0mTc-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSclock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
