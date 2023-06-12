SUMMARY = "Haskell lpeg profiling library"
DESCRIPTION = "This package provides the Haskell lpeg profiling library."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-prof-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "2cfa07abc34c3f90d8f0e86add743a9ffe996f4305fb63241599ef402d95ac895e91dd85898e28b3c8236281683815b769e6273fbfb5cf6d34612476620c6941"

RPROVIDES:${PN} += "ghc-lpeg-prof \
ghc-lpeg-prof(aarch-64) \
ghc-prof(lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9)"
RDEPENDS:${PN} += "ghc-lpeg-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(lua-2.3.1-16mGxirchUh4T3oJJYdFzu)"

inherit rpm
