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

RPM_NAME = "ghc-filepattern-0.1.3-2.7.aarch64.rpm"
RPM_HASH = "07a689ff5656f3990025d1712f77e3df63383b33cbb42677f8349c697bc8fab767f804cd28758ebed5d77b130b21e17c94aab2545c0da3d0c8d965a908a33818"

RPROVIDES:${PN} += "ghc-filepattern \
libHSfilepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSclock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSextra-1.7.13-CLIQu72ADU8JHmf7UWoQG4-ghc9.4.5.so \
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
