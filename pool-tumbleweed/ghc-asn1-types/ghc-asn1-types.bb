SUMMARY = "ASN.1 types"
DESCRIPTION = "ASN.1 standard types."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-0.3.4-5.3.aarch64.rpm"
RPM_HASH = "0f04c07e5d068ce4a525ee9c6091faeeb5d0ca8fa1dafe6492a9f327cb2381344bf3336b153f7afe07872c536d5fd9105c297db31d862d6f65c0412e0817d304"

RPROVIDES:${PN} += "ghc-asn1-types \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
