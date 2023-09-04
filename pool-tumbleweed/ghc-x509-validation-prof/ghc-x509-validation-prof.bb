SUMMARY = "Haskell x509-validation profiling library"
DESCRIPTION = "This package provides the Haskell x509-validation profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-prof-1.6.12-2.8.aarch64.rpm"
RPM_HASH = "2af502b6fdb9965813fef6885142b3fcf8d59d39a81a231b5e82a7c12529228c00c6798c208d07c7379a0a18ec53ba655bce466e078f76865bdbedbd19090194"

RPROVIDES:${PN} += "ghc-prof-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4 \
ghc-x509-validation-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-prof-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-validation-devel"

inherit rpm
