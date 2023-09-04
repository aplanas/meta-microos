SUMMARY = "Analysis and generation of C code"
DESCRIPTION = "Language C is a haskell library for the analysis and generation of C code. \
It features a complete, well tested parser and pretty printer for all of C99 \
and a large set of C11 and clang/GNU extensions."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-0.9.2-2.8.aarch64.rpm"
RPM_HASH = "3f2d54cdc4a58139264158386cbd73c134c3c6b63378bdd43a61e277d42ea480df0b91d75eee108f04220234dbb702cc08be7e4717f24f6c3c6165cf16dac11e"

RPROVIDES:${PN} += "ghc-language-c \
libHSlanguage-c-0.9.2-Ao2qt71CS5kEu13HVpHpG1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
