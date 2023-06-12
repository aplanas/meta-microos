SUMMARY = "Haskell alsa-core profiling library"
DESCRIPTION = "This package provides the Haskell alsa-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-prof-0.5.0.1-4.2.aarch64.rpm"
RPM_HASH = "11bd1c94efa28bfe831eaea733883324c15ca5a5b9224952e083422479dfc2a3c8f2c7646cb4188858f3585d7a2254b2c2d892de4898cc2421e395eba2ba49f8"

RPROVIDES:${PN} += "ghc-alsa-core-prof \
ghc-alsa-core-prof(aarch-64) \
ghc-prof(alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg)"
RDEPENDS:${PN} += "ghc-alsa-core-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY)"

inherit rpm
