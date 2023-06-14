SUMMARY = "Haskell parsec library"
DESCRIPTION = "This package provides the Haskell parsec library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-3.1.16.1-3.1.aarch64.rpm"
RPM_HASH = "b0a0ec08bc3ccdd6c50930450b3ca54d21c92c1a8f12fcba06cd14ade747e98af50bcf2f8efd363a78b2c62140eecd3e2d9a844a1ebcdd1daf8d9bf6072eeca6"

RPROVIDES:${PN} += "ghc-parsec \
libHSparsec-3.1.16.1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
