SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.10.aarch64.rpm"
RPM_HASH = "28ed8671a10cc27e1eefe7e39dbe4fab00f42649e9c4ecf102a6e1521c1a7246b6c820e43a5009134015f5242c8288f08fc0ed259c5126fd93ed75728f0d71e1"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-DKquH4NR4zs5BA4tBpnI9m \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm
