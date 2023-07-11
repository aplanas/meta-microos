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

RPM_NAME = "ghc-tls-1.6.0-2.6.aarch64.rpm"
RPM_HASH = "4b9f2fe9131176ef4777b1e9b193ceb96324f3a1388e309f390769cacae51254ad81f6318eed78d663de631a9dbc63a5ffa49ccb32fccba28baa62939b9029cd"

RPROVIDES:${PN} += "ghc-tls \
libHStls-1.6.0-GPxmmQRGk0xt2NkvZcJeD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt-ghc9.4.5.so \
libHSasn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm-ghc9.4.5.so \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
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
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSpem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSx509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la-ghc9.4.5.so \
libHSx509-store-1.6.9-KWawLwgFfWnohDCwWLuXH-ghc9.4.5.so \
libHSx509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
