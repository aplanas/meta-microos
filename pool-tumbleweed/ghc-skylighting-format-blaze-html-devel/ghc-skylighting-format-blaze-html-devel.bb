SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1-2.10.aarch64.rpm"
RPM_HASH = "7790cf0ffad5a388142d36367cd6efbdcab66cb4093364073e31f1a1ffd7d6e29b3493e6592f632ccd83ce8428305c546ba5f2ae62260176ca170b55adf747df"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1-IxxFYeMhOngAXP1tckorZR \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
