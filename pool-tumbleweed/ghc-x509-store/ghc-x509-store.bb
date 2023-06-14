SUMMARY = "X.509 collection accessing and storing methods"
DESCRIPTION = "X.509 collection accessing and storing methods for certificate, crl, exception \
list."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-1.6.9-2.3.aarch64.rpm"
RPM_HASH = "c50497bb6bf8c6058915bbeb0007c20daa7894dd6f627be742388b7d40b5c6a871e6a6e2db1fb1965347a139fe663d9407794eeadeec08dea5c8f48bb1c69e2e"

RPROVIDES:${PN} += "ghc-x509-store \
libHSx509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk-ghc9.4.5.so \
libHSasn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV-ghc9.4.5.so \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptonite-0.30-AbDFzA14dNKDfU9pLpBLye-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSx509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
