SUMMARY = "Handle per-operating-system X.509 accessors and storage"
DESCRIPTION = "System X.509 handling for accessing operating system dependents store and other \
storage methods."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-1.6.7-2.8.aarch64.rpm"
RPM_HASH = "ce43a05ff4225335f5a6b93c36d1d995f7b40f8760264956e9431c433cfb2d700bd3f730af73b7371190e1d531be76057eea24f0d04a7b6f22d624561906db95"

RPROVIDES:${PN} += "ghc-x509-system \
libHSx509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSx509-1.7.7-2oKbMm4GXJUL45OKqbcDfn-ghc9.4.6.so \
libHSx509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
