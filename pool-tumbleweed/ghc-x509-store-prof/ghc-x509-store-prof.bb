SUMMARY = "Haskell x509-store profiling library"
DESCRIPTION = "This package provides the Haskell x509-store profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-prof-1.6.9-2.8.aarch64.rpm"
RPM_HASH = "e2c8bfeb1e9ff4e93d2a979ebd1c76aba6da0a4f0dc13d81cd43034c020210f948574cd9949048792f967a3b456df14e1f39990172c215468aebb2bf45d1b79d"

RPROVIDES:${PN} += "ghc-prof-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-store-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-x509-store-devel"

inherit rpm
