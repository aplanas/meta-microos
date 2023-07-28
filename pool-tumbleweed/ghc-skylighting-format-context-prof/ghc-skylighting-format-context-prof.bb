SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.5.aarch64.rpm"
RPM_HASH = "a851a0a79245211905a3422b44cd9f160757853a0e4660912448dd8cb1579e072ffce9a8b663e49679760cfe1dbeeee3c267a7b934fda4350a4630043e0a37d3"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-DaN7b6FAIhw69Ip8uy59f9 \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm
