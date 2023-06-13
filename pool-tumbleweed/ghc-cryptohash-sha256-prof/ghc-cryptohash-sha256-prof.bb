SUMMARY = "Haskell cryptohash-sha256 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-prof-0.11.102.1-3.3.aarch64.rpm"
RPM_HASH = "883ec521be9ffae8ca27fb85daca175b5fdb85c610c0614bddaa2f8b5340a097decdddf2f241ff5776a232d8ae450425243b413a4ff1c748151bdbdfad058ecc"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-prof \
ghc-cryptohash-sha256-prof(aarch-64) \
ghc-prof(cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD)"

RDEPENDS:${PN} += "ghc-cryptohash-sha256-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
