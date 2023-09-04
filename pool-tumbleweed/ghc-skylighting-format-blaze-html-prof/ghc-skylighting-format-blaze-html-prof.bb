SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1-2.10.aarch64.rpm"
RPM_HASH = "d3309cff0e0f09ae2576b7f3adac46c7571a3029929f681ae2e51291fd7009e359181e8d1c499d30ccac7ef25d9a5ed86239643f54d9ffb9feaf3de780fe1f08"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1-IxxFYeMhOngAXP1tckorZR \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm
