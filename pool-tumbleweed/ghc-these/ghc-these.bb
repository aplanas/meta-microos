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

RPM_NAME = "ghc-these-1.2-1.7.aarch64.rpm"
RPM_HASH = "ee663b91e75e162130cf9ed06d20facc66490aee5544f6748bf00e52a598a535ce3d259f51a4d249ba4ff5e75ff41a01f7f86c546cc90ce6b236c88d2a08d3ab"

RPROVIDES:${PN} += "ghc-these \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
