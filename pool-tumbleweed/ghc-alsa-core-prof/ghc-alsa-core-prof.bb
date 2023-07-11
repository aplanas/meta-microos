SUMMARY = "Haskell alsa-core profiling library"
DESCRIPTION = "This package provides the Haskell alsa-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-prof-0.5.0.1-4.3.aarch64.rpm"
RPM_HASH = "bc8f15001c5e0d55d8bf59b3aab97d5d2463fe15fa29ba94df18177f7b403a4161e74040439bad321fa0e3c6104f0a806d94a9e3eb7f6fb6f789793d17a667ec"

RPROVIDES:${PN} += "ghc-alsa-core-prof \
ghc-prof-alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg"

RDEPENDS:${PN} += "ghc-alsa-core-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY"

inherit rpm
