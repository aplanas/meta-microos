SUMMARY = "Bidirectional mapping between two key types"
DESCRIPTION = "A data structure representing a bidirectional mapping between two key types. \
Each value in the bimap is associated with exactly one value of the opposite \
type."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "3e1e20b0d8e27788a0a9c6cded57ab0f35dcfb6e79bc980173f57be7109b75542dbd132dff73a098763b16c10c3f3d4697e0dd10c357c364e303819d290370a3"

RPROVIDES:${PN} += "ghc-bimap \
libHSbimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
