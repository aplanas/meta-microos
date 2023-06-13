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

PV = "1.7.13"

RPM_NAME = "ghc-extra-1.7.13-1.2.aarch64.rpm"
RPM_HASH = "518d805c7b3cd7db29cd79fc44aba9c3319b11adecf5e55b928cad580daf6aa2927508eabb3d8dd3a5b9ff1e80f2cd2d02ba4a94db96002af8aa6a5a75b9b86d"

RPROVIDES:${PN} += "ghc-extra \
ghc-extra(aarch-64) \
libHSextra-1.7.13-CLIQu72ADU8JHmf7UWoQG4-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSclock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
