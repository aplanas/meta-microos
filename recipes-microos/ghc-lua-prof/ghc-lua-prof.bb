SUMMARY = "Haskell lua profiling library"
DESCRIPTION = "This package provides the Haskell lua profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-prof-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "9c04cbef4802c971cfa63116b60d84e2f4c9c64e817a1c8c5dc8e6fc6f61c9959f3b278dc68370a50b5591a2a44dafa8316af1aefbc45a8ea57435e62152f239"

RPROVIDES:${PN} += "ghc-lua-prof ghc-lua-prof(aarch-64) ghc-prof(lua-2.3.1-16mGxirchUh4T3oJJYdFzu)"
RDEPENDS:${PN} += "ghc-lua-devel ghc-prof(base-4.17.1.0)"

inherit rpm
