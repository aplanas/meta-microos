SUMMARY = "ASN1 data reader and writer in RAW, BER and DER forms"
DESCRIPTION = "ASN1 data reader and writer in raw form with supports for high level forms of \
ASN1 (BER, and DER)."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-0.9.6-8.8.aarch64.rpm"
RPM_HASH = "beffc9621ee16f69be9d0058079f9ecff86f0efd469d32683139398daf4f14763c511d22175a71c3efccfa8871aff02ab92005d11bb018b0424c590bb863a2f4"

RPROVIDES:${PN} += "ghc-asn1-encoding \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
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
