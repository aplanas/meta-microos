SUMMARY = "Haskell ansi-wl-pprint profiling library"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-prof-0.6.9-10.2.aarch64.rpm"
RPM_HASH = "e4c46d37094eb936c202ddd4538eae8a174bfbb464e7f12ccbfc850f837e9b4de29c7b8b41c4a8d2d7507b228bf38482ba5ffd8f74c5e273bccefbd187705c20"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-prof \
ghc-ansi-wl-pprint-prof(aarch-64) \
ghc-prof(ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI)"
RDEPENDS:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-prof(base-4.17.1.0)"

inherit rpm
