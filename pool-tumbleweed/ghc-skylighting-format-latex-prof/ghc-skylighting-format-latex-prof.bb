SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.10.aarch64.rpm"
RPM_HASH = "58d8afb5b66456b204229391ccd3fb45ecb2c9f7500d676c2926c0a1de60e18cdaabbdf2f980a7e8162efe73dbaec7cb68c52586f24297fe6746e29a33d0929e"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-88rCuL9rp0NWp0m2geBsy \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-latex-devel"

inherit rpm
