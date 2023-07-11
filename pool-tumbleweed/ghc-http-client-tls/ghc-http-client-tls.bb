SUMMARY = "Http-client backend using the connection package and tls library"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <https://www.stackage.org/package/http-client-tls>."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-0.3.6.1-2.4.aarch64.rpm"
RPM_HASH = "5a058d9901dea03396bb2a1bd90e7fe4bac02850524db0695e46691e501ae3b388235354a29fae7a91d2d0bf553ac70867c0ee0da2e01f17975e736bb2f807ff"

RPROVIDES:${PN} += "ghc-http-client-tls \
libHShttp-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt-ghc9.4.5.so \
libHSasn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm-ghc9.4.5.so \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHSconnection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSiproute-1.7.12-IhoklPQYItb8qGu1G3vmcD-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsocks-0.6.1-8gBEgerYb38E7aCOOcHCwN-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStls-1.6.0-GPxmmQRGk0xt2NkvZcJeD-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSx509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la-ghc9.4.5.so \
libHSx509-store-1.6.9-KWawLwgFfWnohDCwWLuXH-ghc9.4.5.so \
libHSx509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t-ghc9.4.5.so \
libHSx509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
