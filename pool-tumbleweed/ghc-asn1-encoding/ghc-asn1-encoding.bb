SUMMARY = "ASN1 data reader and writer in RAW, BER and DER forms"
DESCRIPTION = "ASN1 data reader and writer in raw form with supports for high level forms of \
ASN1 (BER, and DER)."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-0.9.6-8.6.aarch64.rpm"
RPM_HASH = "7db01c619759bc4374bbf9329fd4f8b639548763579abe8e1952bcac5e2810dab8e67942e9cc243d65727adb729ae15a692742d2cfc70b9ed548e5fc375404d1"

RPROVIDES:${PN} += "ghc-asn1-encoding \
libHSasn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
