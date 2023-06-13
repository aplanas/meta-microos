SUMMARY = "Analysis and generation of C code"
DESCRIPTION = "Language C is a haskell library for the analysis and generation of C code. \
It features a complete, well tested parser and pretty printer for all of C99 \
and a large set of C11 and clang/GNU extensions."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-0.9.2-2.3.aarch64.rpm"
RPM_HASH = "e21ef858684fcb22b1e9e104ca3726ed9057f80f58a41bef8d44a727a7bc4275ac26e4804ad6c5952bb8e854888658c651498c0826aac2a607db896e4c76546c"

RPROVIDES:${PN} += "ghc-language-c \
ghc-language-c(aarch-64) \
libHSlanguage-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
