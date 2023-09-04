SUMMARY = "SPDX license expression language, Extras"
DESCRIPTION = "Cabal provides SPDX types. This package provides some extras."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-1.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "22643fcf4837be2f16859174a22be4860051312f330b40b3c0416075ce74b9d9748936aa7f0dfb5d2d853eee33e2fdbcda2bed24c5cd4c8b13967bfd5691dea4"

RPROVIDES:${PN} += "ghc-spdx \
libHSspdx-1.0.0.3-4SEI6zaM8QU9eQO97OlzoR-ghc9.4.6.so"

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
