SUMMARY = "Haskell x509-validation library development files"
DESCRIPTION = "This package provides the Haskell x509-validation library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-devel-1.6.12-2.8.aarch64.rpm"
RPM_HASH = "861ec6400f7bc868173bf84d97962d210882026221d111b03e65b0f016edb8ad1bf1937216a296861ae9c39b3e8dca7711cd0da23ba82eb383293aed251e9fe8"

RPROVIDES:${PN} += "ghc-devel-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4 \
ghc-x509-validation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-devel-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-x509-validation"

inherit rpm
