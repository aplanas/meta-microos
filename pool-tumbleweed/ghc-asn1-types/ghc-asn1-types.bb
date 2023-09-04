SUMMARY = "ASN.1 types"
DESCRIPTION = "ASN.1 standard types."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-0.3.4-5.8.aarch64.rpm"
RPM_HASH = "ccfe8b4def1a025ac34fd0fd2d9a04505dae12f431d359223763100a1678b85970108434d657bf8578d35d75e686d4119f9930cf3a8bba944e404feb4c736589"

RPROVIDES:${PN} += "ghc-asn1-types \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
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
