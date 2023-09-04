SUMMARY = "Haskell dec profiling library"
DESCRIPTION = "This package provides the Haskell dec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-prof-0.0.5-2.4.aarch64.rpm"
RPM_HASH = "f382c092980620b321a1a1d03cbb4c451835898ea570f88f58d5419b6eb330e96066f530084cd50d5a7b85c52bde546f9c9dbe4b6fffee5e6b3d01e2f0cf73ec"

RPROVIDES:${PN} += "ghc-dec-prof \
ghc-prof-dec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7"

RDEPENDS:${PN} += "ghc-dec-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-boring-0.2.1-8UoR96J8uAp13B13xTdCnI"

inherit rpm
