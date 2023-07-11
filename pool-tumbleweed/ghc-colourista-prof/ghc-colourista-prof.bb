SUMMARY = "Haskell colourista profiling library"
DESCRIPTION = "This package provides the Haskell colourista profiling library."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-prof-0.1.0.2-1.6.aarch64.rpm"
RPM_HASH = "df12d15e44fd6d766ac200f95ab44a3719b26963d502eb7ce53bc45fb4e021583b0e078db35a65e6869d943b4bbbac478476fb165690cf0ee9f21b05fa3f88ed"

RPROVIDES:${PN} += "ghc-colourista-prof \
ghc-prof-colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3"

RDEPENDS:${PN} += "ghc-colourista-devel \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
