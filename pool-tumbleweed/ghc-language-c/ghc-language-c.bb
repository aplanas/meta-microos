SUMMARY = "Analysis and generation of C code"
DESCRIPTION = "Language C is a haskell library for the analysis and generation of C code. \
It features a complete, well tested parser and pretty printer for all of C99 \
and a large set of C11 and clang/GNU extensions."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-0.9.2-2.6.aarch64.rpm"
RPM_HASH = "010ca9d4a0e393e9caee2f5c40fec19283970d2d2dfeefce47b6a592b4a657aeef480801a304221af5a483c3a7e0a9e644c6cd26c20efc7f6e23b2a53d234334"

RPROVIDES:${PN} += "ghc-language-c \
libHSlanguage-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
