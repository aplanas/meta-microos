SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.11.aarch64.rpm"
RPM_HASH = "cddb8ff51f2e361aed7b7e666fd20dbdc4318777e3f171bc3b371b498306c3f3f612812219c328028b99981d1504862139b21ff8b27981e26de0b82762d53597"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-8FyF1SOujOsEQ3XyvF7m1i \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-ansi-devel"

inherit rpm
