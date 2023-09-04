SUMMARY = "Haskell cabal2spec library"
DESCRIPTION = "This package provides the Haskell cabal2spec shared library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-2.7.0-1.5.aarch64.rpm"
RPM_HASH = "8a4eeeee158983d03d631dfe55c0f4f3b1e5d42ed73d5dd8b05422c8a05e912fa70a2e4bfe86468be4193b9956905318deaa00caeabb7dadeeb92d7abaabfe7b"

RPROVIDES:${PN} += "ghc-cabal2spec \
libHScabal2spec-2.7.0-8dWbD7pVkXo1xhNArKyBtJ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.6.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
