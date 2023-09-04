SUMMARY = "Haskell mmorph profiling library"
DESCRIPTION = "This package provides the Haskell mmorph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-prof-1.2.0-4.3.aarch64.rpm"
RPM_HASH = "e0c0c3974866ca2cf679306ab30ede59319c2200a243d22416a1d79fa3cddfe93bae90e8cd3992a8fb1e1d57f516dc787f3dd506a49411abe2f506119411dc9a"

RPROVIDES:${PN} += "ghc-mmorph-prof \
ghc-prof-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn"

RDEPENDS:${PN} += "ghc-mmorph-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
