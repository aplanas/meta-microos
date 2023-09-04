SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.10.aarch64.rpm"
RPM_HASH = "378be2811650e5c5a37de337a9b31fce4075319dbc46d3128f34c3eb1613d695e0be3878ed7eaf994cbd44e51881f2efa0a91c37adbb2579d648044292c64053"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-88rCuL9rp0NWp0m2geBsy \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm
