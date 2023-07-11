SUMMARY = "ASN.1 types"
DESCRIPTION = "ASN.1 standard types."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-0.3.4-5.6.aarch64.rpm"
RPM_HASH = "5ef88e61b5a7608d28f2ac9da38b65a6b62bcaedb5bac746993a306d1c62b3f7308129013b5bf9a2e94c16d1e440fdd50aaf7dafe71d1786457065d551d5a91f"

RPROVIDES:${PN} += "ghc-asn1-types \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
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
