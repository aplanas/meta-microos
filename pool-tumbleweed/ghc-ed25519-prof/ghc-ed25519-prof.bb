SUMMARY = "Haskell ed25519 profiling library"
DESCRIPTION = "This package provides the Haskell ed25519 profiling library."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-prof-0.0.5.0-16.4.aarch64.rpm"
RPM_HASH = "92f235254ea5bbf57ef4a03d7e43407765f7926338b77a4e269b776fe8ea6909264368f4ba2300dcbe893803a651168cbcc8fac1feb432ce4344808b7aa171da"

RPROVIDES:${PN} += "ghc-ed25519-prof \
ghc-prof-ed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0"

RDEPENDS:${PN} += "ghc-ed25519-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
