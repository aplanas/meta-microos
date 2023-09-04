SUMMARY = "Haskell colourista profiling library"
DESCRIPTION = "This package provides the Haskell colourista profiling library."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-prof-0.1.0.2-2.2.aarch64.rpm"
RPM_HASH = "f19400e7396bb7881e556d4685b7fad1569e016049a4ac3f0554cbbd891840ab7e03c0cd2b6a7c8e30f4236a200749798abf9671754d61ff02ff1015f0f609e8"

RPROVIDES:${PN} += "ghc-colourista-prof \
ghc-prof-colourista-0.1.0.2-19lLFYWP0ZEDfSw3obIpeF"

RDEPENDS:${PN} += "ghc-colourista-devel \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
