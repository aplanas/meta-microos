SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-devel-0.13.4.1-1.5.aarch64.rpm"
RPM_HASH = "c6d26cb1c31e4d432a96b41681a64aa2519f0d5cb72a61fc1dfd967f9a589f3ec77ccf2f507661802cec363e68b3a486c1ffe8c0dbf527b39a7712f38412cc85"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-skylighting-format-ansi-0.1-6YWd7hT12ae6ct6gjoY3vc \
ghc-devel-skylighting-format-blaze-html-0.1.1-IxxFYeMhOngAXP1tckorZR \
ghc-devel-skylighting-format-context-0.1.0.2-DKquH4NR4zs5BA4tBpnI9m \
ghc-devel-skylighting-format-latex-0.1-88rCuL9rp0NWp0m2geBsy \
ghc-skylighting"

inherit rpm
