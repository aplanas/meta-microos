SUMMARY = "Constraint manipulation"
DESCRIPTION = "GHC 7.4 gave us the ability to talk about 'ConstraintKinds'. They stopped \
crashing the compiler in GHC 7.6. \
 \
This package provides a vocabulary for working with them."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-0.13.4-3.2.aarch64.rpm"
RPM_HASH = "1201e927ce5fd18e7ac620b1d02dd91397e93a00399b5bc9902e733ebf57e1fadd6f5f0a4aec5b8854733f20980c529fa38ef2fb3c12592f3aa1dfec91b2c3d9"

RPROVIDES:${PN} += "ghc-constraints \
libHSconstraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHStype-equality-1-GeDZojRKCH6645jDbV5JLU-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
