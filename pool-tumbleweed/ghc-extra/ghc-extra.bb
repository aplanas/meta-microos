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

RPM_NAME = "ghc-extra-1.7.14-1.3.aarch64.rpm"
RPM_HASH = "2d2799b56c45100a430b6361cfbcb58d535d28cddfae45a69d48bd23284986c9603cc66a2e7ca4fa28ae462e01552a21357c2d4d9f9e9462fff4838e39ee27c0"

RPROVIDES:${PN} += "ghc-extra \
libHSextra-1.7.14-DfcUn0kURmM7zhMG6RTp91-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSclock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
