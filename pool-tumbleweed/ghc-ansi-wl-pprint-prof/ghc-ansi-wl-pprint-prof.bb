SUMMARY = "Haskell ansi-wl-pprint profiling library"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-prof-0.6.9-11.1.aarch64.rpm"
RPM_HASH = "a210f3c75f6507d5445aa1d8aacaf80691a9f610111e7641e0b3cf9d7ea9c8336d7cb2c751136b1ed88007cefa7b2ef9b7d81978953157a81f72aea56ffea286"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-prof \
ghc-prof-ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI"

RDEPENDS:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0"

inherit rpm
