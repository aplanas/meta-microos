SUMMARY = "Haskell lua profiling library"
DESCRIPTION = "This package provides the Haskell lua profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-prof-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "f61cddebb7fb2599cb8960390cfe02db98d4131bd986c5db404ba65bf6236f74f73295234e7c7d26925d6129fccbebe651e0a038bccd48bab12483b778b0ea35"

RPROVIDES:${PN} += "ghc-lua-prof \
ghc-prof-lua-2.3.1-16mGxirchUh4T3oJJYdFzu"

RDEPENDS:${PN} += "ghc-lua-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
