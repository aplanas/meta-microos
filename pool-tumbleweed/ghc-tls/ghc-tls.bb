SUMMARY = "TLS/SSL protocol native implementation (Server and Client)"
DESCRIPTION = "Native Haskell TLS and SSL protocol implementation for server and client. \
 \
This provides a high-level implementation of a sensitive security protocol, \
eliminating a common set of security issues through the use of the advanced \
type system, high level constructions and common Haskell features. \
 \
Currently implement the TLS1.0, TLS1.1, TLS1.2 and TLS 1.3 protocol, and \
support RSA and Ephemeral (Elliptic curve and regular) Diffie Hellman key \
exchanges, and many extensions. \
 \
Some debug tools linked with tls, are available through the \
<http://hackage.haskell.org/package/tls-debug/>."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "698848862edff202e264b90ec874e3de6f6aba145ef1931c8915c38175d943c8e4ec54041c678c3526a602ffa607acfda363a66c5f0021c401536af7b91d5be6"

RPROVIDES:${PN} += "ghc-tls \
libHStls-1.6.0-48osxqPawrs8SblkErmTaM-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk-ghc9.4.5.so \
libHSasn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV-ghc9.4.5.so \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptonite-0.30-AbDFzA14dNKDfU9pLpBLye-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSx509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw-ghc9.4.5.so \
libHSx509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt-ghc9.4.5.so \
libHSx509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
