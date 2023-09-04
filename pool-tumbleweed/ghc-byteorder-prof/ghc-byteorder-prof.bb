SUMMARY = "Haskell byteorder profiling library"
DESCRIPTION = "This package provides the Haskell byteorder profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-prof-1.0.4-4.3.aarch64.rpm"
RPM_HASH = "24e82f27bdb544c179ad9cf973ffd9fbc5f16a61aeb405ad101a6ae40ea790484c724b85812bdf51673042a4cbd9d1f27bf14af96eb4e389aed8c55e140927de"

RPROVIDES:${PN} += "ghc-byteorder-prof \
ghc-prof-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0"

RDEPENDS:${PN} += "ghc-byteorder-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
