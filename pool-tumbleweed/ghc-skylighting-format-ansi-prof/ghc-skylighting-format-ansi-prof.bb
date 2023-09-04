SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.10.aarch64.rpm"
RPM_HASH = "fb7f527975c4a2c62ad0fe9dc7b004bba49d302264e3cd9e659eb8e7e938632f291c293c1df3f2add41b428426081698fa5263baedf7d13f297f9cfd41aea75d"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-6YWd7hT12ae6ct6gjoY3vc \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-ansi-devel"

inherit rpm
