SUMMARY = "Algorithms on GHC parse trees"
DESCRIPTION = "Algorithms on GHC parse trees."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-9.4.0.0-1.11.aarch64.rpm"
RPM_HASH = "80e5b4b92bd3ca06b266fd71f1bff479e20ab66bc33de8028fe919ef4a35a6a18a643435b576f577bb17b3f911d76868790a6d7753c927d1b125eac9ee258272"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex \
libHSghc-lib-parser-ex-9.4.0.0-FnsACeicRjR9lrHyF5i7Lw-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-lib-parser-9.4.6.20230808-BTkqGaXXohb8duAYJJlTmh-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSuniplate-1.6.13-EEjCQACslljIQmS3K29CqX-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
