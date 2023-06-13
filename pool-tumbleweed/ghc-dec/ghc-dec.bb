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
ghc-dec(aarch-64) \
libHSdec-0.0.5-4k85S2UkQTWCpK3j0IuOFm-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSboring-0.2.1-J8lJX6Vz53r2bssyBwOtpl-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
