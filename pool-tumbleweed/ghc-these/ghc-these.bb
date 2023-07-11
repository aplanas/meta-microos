SUMMARY = "An either-or-both data type"
DESCRIPTION = "This package provides a data type 'These a b' which can hold a value of either \
type or values of each type. This is usually thought of as an 'inclusive or' \
type (contrasting 'Either a b' as 'exclusive or') or as an 'outer join' type \
(contrasting '(a, b)' as 'inner join'). \
 \
' data These a b = This a | That b | These a b ' \
 \
Since version 1, this package was split into parts: \
 \
* <https://hackage.haskell.org/package/semialign semialign> For 'Align' and \
'Zip' type-classes. \
 \
* <https://hackage.haskell.org/package/semialign-indexed semialign-indexed> For \
'SemialignWithIndex' class, providing 'ialignWith' and 'izipWith'. \
 \
* <https://hackage.haskell.org/package/these-lens these-lens> For lens \
combinators. \
 \
* <http://hackage.haskell.org/package/monad-chronicle monad-chronicle> For \
transformers variant of 'These'."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-1.2-1.3.aarch64.rpm"
RPM_HASH = "f68ac38ebc725002f4a63479cadcda8c741faf5fc0930cdb591d3a8eb5c7c27200443a534e439e8ba7847db557ca13f069b2fb6d535ddc66bcd0c1b14021cffa"

RPROVIDES:${PN} += "ghc-these \
libHSthese-1.2-3gvRWs9hjHpLbWG1JfTveA-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSassoc-1.1-H3gdf0Ue1d5sn9822dJ4G-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
