SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-prof-0.13.4.1-1.5.aarch64.rpm"
RPM_HASH = "f769f0c482180c1f148393af41627998878e5c8383caf420e96fbe2c877333aa144b820cfa7380ec8e782575ec1803a518df54304b4b46040eecd3b0c0107c69"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-prof-skylighting-format-ansi-0.1-6YWd7hT12ae6ct6gjoY3vc \
ghc-prof-skylighting-format-blaze-html-0.1.1-IxxFYeMhOngAXP1tckorZR \
ghc-prof-skylighting-format-context-0.1.0.2-DKquH4NR4zs5BA4tBpnI9m \
ghc-prof-skylighting-format-latex-0.1-88rCuL9rp0NWp0m2geBsy \
ghc-skylighting-devel"

inherit rpm
