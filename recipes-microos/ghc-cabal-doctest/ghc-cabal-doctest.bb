SUMMARY = "A Setup.hs helper for running doctests"
DESCRIPTION = "As of now (end of 2021), there isn't 'cabal doctest' command. Yet, to properly \
work, 'doctest' needs plenty of configuration. This library provides the common \
bits for writing a custom 'Setup.hs'."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-1.0.9-4.2.aarch64.rpm"
RPM_HASH = "6ae4279d492e2664030f44a25ce19fa1808fa370abf55614fb597276c226ef5e4b5cf6cb865e24168f1c2c250bd18dc8d6b7ee4a93cc79ceb5594224e63c16e6"

RPROVIDES:${PN} += "ghc-cabal-doctest ghc-cabal-doctest(aarch-64) libHScabal-doctest-1.0.9-E4yWN7tR5mMItu3qIh0oSF-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.5.so()(64bit) libHSCabal-syntax-3.8.1.0-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
