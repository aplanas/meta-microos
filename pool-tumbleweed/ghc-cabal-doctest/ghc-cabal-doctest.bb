SUMMARY = "A Setup.hs helper for running doctests"
DESCRIPTION = "As of now (end of 2021), there isn't 'cabal doctest' command. Yet, to properly \
work, 'doctest' needs plenty of configuration. This library provides the common \
bits for writing a custom 'Setup.hs'."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-1.0.9-4.3.aarch64.rpm"
RPM_HASH = "b5e68de164f2c01d6a8ca586ce4a637dd600bd8faec7735d7fd484e7311089b5c438d47c50831a135d60048654ceefef277e23c304271f95dd0f5609604368d3"

RPROVIDES:${PN} += "ghc-cabal-doctest \
libHScabal-doctest-1.0.9-4FGoSiQ39Py47R5SD4NHa8-ghc9.4.6.so"

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
