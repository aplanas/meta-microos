SUMMARY = "Simple monadic parser for ASN1 stream types"
DESCRIPTION = "Simple monadic parser for ASN1 stream types, when ASN1 pattern matching is not \
convenient."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-0.9.5-6.4.aarch64.rpm"
RPM_HASH = "fcdba6bd66f195850a0fce63a02f7db86156e3a11b8952b1a6b2c1070e5481a7488522df9ee4a422570be0320e97072d692396f42afdcf9efcd1476052a171bf"

RPROVIDES:${PN} += "ghc-asn1-parse \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
