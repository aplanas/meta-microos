SUMMARY = "Haskell cryptohash-sha256 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-prof-0.11.102.1-3.6.aarch64.rpm"
RPM_HASH = "1de363de078c9a7b65f5998fcf51e3a76429d01a81f983cff401771845a576b9bed116539ab4ccb9c41c0b6fbb918d4bdc765b73136bd14ccb92c07be49426cc"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-prof \
ghc-prof-cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD"

RDEPENDS:${PN} += "ghc-cryptohash-sha256-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
