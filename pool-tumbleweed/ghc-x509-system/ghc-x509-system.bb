SUMMARY = "Handle per-operating-system X.509 accessors and storage"
DESCRIPTION = "System X.509 handling for accessing operating system dependents store and other \
storage methods."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-1.6.7-2.6.aarch64.rpm"
RPM_HASH = "eedc41f2f7f1d5c203fc703d858dde115889b244f1974aae717cb03095f89701f5ae319dcafe1228a4b8119586ff6719742e7bc8fce63b0da61c3d5da4e1124c"

RPROVIDES:${PN} += "ghc-x509-system \
libHSx509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt-ghc9.4.5.so \
libHSasn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm-ghc9.4.5.so \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSx509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la-ghc9.4.5.so \
libHSx509-store-1.6.9-KWawLwgFfWnohDCwWLuXH-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
