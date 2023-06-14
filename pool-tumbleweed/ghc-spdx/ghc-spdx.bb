SUMMARY = "SPDX license expression language, Extras"
DESCRIPTION = "Cabal provides SPDX types. This package provides some extras."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-1.0.0.3-1.2.aarch64.rpm"
RPM_HASH = "fd930992f38fb9860697311f8cee1b488a961fd5a0aec8d0546b6466355176fdcefc473e8dfc7019cd527ae1c4a9b3fefeccab244b1309d1b473444f84927353"

RPROVIDES:${PN} += "ghc-spdx \
libHSspdx-1.0.0.3-JwdNfzEpnM57Bwmw6OiiTp-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.5.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
