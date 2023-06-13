SUMMARY = "File path glob-like matching"
DESCRIPTION = "A library for matching files using patterns such as ''src/**/*.png'' for all \
'.png' files recursively under the 'src' directory. Features: \
 \
* All matching is /O(n)/. Most functions precompute some information given only \
one argument. \
 \
* See 'System.FilePattern' and '?==' simple matching and semantics. \
 \
* Use 'match' and 'substitute' to extract suitable strings from the '*' and \
'**' matches, and substitute them back into other patterns. \
 \
* Use 'step' and 'matchMany' to perform bulk matching of many patterns against \
many paths simultaneously. \
 \
* Use 'System.FilePattern.Directory' to perform optimised directory traverals \
using patterns. \
 \
Originally taken from the <https://hackage.haskell.org/package/shake Shake \
library>."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-0.1.3-2.4.aarch64.rpm"
RPM_HASH = "659debf52aeaaf7666c0db5fec42a858301490fbd5a094ca79c5f57d9d05e4a2440f4eef047445ed15ef700a053d62c11b61b1ffb86b5c519c9a3d0fba92f470"

RPROVIDES:${PN} += "ghc-filepattern \
ghc-filepattern(aarch-64) \
libHSfilepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSclock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSextra-1.7.13-CLIQu72ADU8JHmf7UWoQG4-ghc9.4.5.so()(64bit) \
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
