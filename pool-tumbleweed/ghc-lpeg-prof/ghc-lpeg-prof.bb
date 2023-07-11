SUMMARY = "Haskell lpeg profiling library"
DESCRIPTION = "This package provides the Haskell lpeg profiling library."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-prof-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "64f7dac9d5c58a0ab3d4d963a0f65255260a59c1cc563682a12fe8fb2d073c71f5976747042f0741d4894ab7e08403aae9a772d5bb91024c2f5d4a26827e018a"

RPROVIDES:${PN} += "ghc-lpeg-prof \
ghc-prof-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9"

RDEPENDS:${PN} += "ghc-lpeg-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-lua-2.3.1-16mGxirchUh4T3oJJYdFzu"

inherit rpm
