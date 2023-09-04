SUMMARY = "Simple and easy network connections API"
DESCRIPTION = "Simple network library for all your connection need. \
 \
Features: Really simple to use, SSL/TLS, SOCKS. \
 \
This library provides a very simple api to create sockets to a destination with \
the choice of SSL/TLS, and SOCKS."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-0.3.1-8.3.aarch64.rpm"
RPM_HASH = "6cd9f7bad51774362bcd582989cae2b4c229a2dfc243aa51dd7d9b2490f8b7bad3e99c0007bd8db493330e587af889df72ef1552f5c5e155543c49478d6ae3bc"

RPROVIDES:${PN} += "ghc-connection \
libHSconnection-0.3.1-HritGhbYIMl4OD06E3KY8G-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSsocks-0.6.1-5RVEIbYAf8qJqchdUVHVHw-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStls-1.6.0-D0DtS2mRMN13yCvXOGSBsv-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSx509-1.7.7-2oKbMm4GXJUL45OKqbcDfn-ghc9.4.6.so \
libHSx509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9-ghc9.4.6.so \
libHSx509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY-ghc9.4.6.so \
libHSx509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
