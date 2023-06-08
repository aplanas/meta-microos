SUMMARY = "Haskell config-ini profiling library"
DESCRIPTION = "This package provides the Haskell config-ini profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.0"

RPM_NAME = "ghc-config-ini-prof-0.2.5.0-3.3.aarch64.rpm"
RPM_HASH = "bf1c9475a712915b267651ca056ed15671986f35806062bb80ead9406db96d95f44179875d2a733e22d527fac5852e64dcedf8bfafe0b0d7c8e5b04b2a427485"

RPROVIDES:${PN} += "ghc-config-ini-prof ghc-config-ini-prof(aarch-64) ghc-prof(config-ini-0.2.5.0-RR92dYVdpi9XWpA99EDX9)"
RDEPENDS:${PN} += "ghc-config-ini-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E)"

inherit rpm
