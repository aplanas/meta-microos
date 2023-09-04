SUMMARY = "Haskell x509-store library development files"
DESCRIPTION = "This package provides the Haskell x509-store library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-devel-1.6.9-2.8.aarch64.rpm"
RPM_HASH = "76a1e42740e56cff52c9ae4ec8e89bc08947fc0abc4a71fa251cc1e61e316c7d09ba365eca213dac13e3615fe1b34ed9b8144c6c60a866f6a40f91e43c2127fd"

RPROVIDES:${PN} += "ghc-devel-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-store-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-x509-store"

inherit rpm
