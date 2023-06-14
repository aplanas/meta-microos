SUMMARY = "Simple monadic parser for ASN1 stream types"
DESCRIPTION = "Simple monadic parser for ASN1 stream types, when ASN1 pattern matching is not \
convenient."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-0.9.5-6.2.aarch64.rpm"
RPM_HASH = "a0818a7f0428d248fe8ad9b32b1ad779a1be518b62c024f3f124e5ee6a15d8916d746c4acf3ca7b504c8243c6cc7ab776f16158573d58e2c5d56f50ed8613db3"

RPROVIDES:${PN} += "ghc-asn1-parse \
libHSasn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk-ghc9.4.5.so \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so \
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
