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

RPM_NAME = "ghc-filepattern-0.1.3-2.11.aarch64.rpm"
RPM_HASH = "fbf183e74702609bc2f4a16fa991f9355f50842c5d9f469916449ce8b5238273bb309be4ce40690a73fd09375ec1e993d81067ade9c2c272121b413625c31909"

RPROVIDES:${PN} += "ghc-filepattern \
libHSfilepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSclock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSextra-1.7.14-DfcUn0kURmM7zhMG6RTp91-ghc9.4.6.so \
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
