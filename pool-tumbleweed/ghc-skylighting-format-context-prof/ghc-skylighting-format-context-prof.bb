SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.6.aarch64.rpm"
RPM_HASH = "b089133a9124c10fcac8bae1eb7774e367765a5eb49278230ef08f493e4ef44a8926c5e312c91ea62d22a23da9e435db34cd2f53197151db6370e8f2e5d5fc55"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-I1BZIYXYOqlBramxRueIsx \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm
