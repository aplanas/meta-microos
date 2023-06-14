SUMMARY = "Decidable propositions"
DESCRIPTION = "This package provides a 'Dec' type. \
 \
' type Neg a = a -> Void \
 \
data Dec a = Yes a | No (Neg a) '."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-0.0.5-2.2.aarch64.rpm"
RPM_HASH = "b796cc4cd038b9f8d8ca232438c4e67995b78a3e2fec5040397791078296ad49cef331d3ea51daf66dd614ace921668faf8c31b6e5899207b99b667c06d02a15"

RPROVIDES:${PN} += "ghc-dec \
libHSdec-0.0.5-4k85S2UkQTWCpK3j0IuOFm-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSboring-0.2.1-J8lJX6Vz53r2bssyBwOtpl-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
