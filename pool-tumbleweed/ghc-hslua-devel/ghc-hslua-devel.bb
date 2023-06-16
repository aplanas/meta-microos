SUMMARY = "Haskell hslua library development files"
DESCRIPTION = "This package provides the Haskell hslua library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-devel-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "4582079cd0b382972e4743e431adeacc98769c87db600ba98948c7b515b07c0b4c6a3e861d36d9050d573cb4f21cca54e169c58cdc0cb8890559de54b639a34c"

RPROVIDES:${PN} += "ghc-devel-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY \
ghc-hslua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-aeson-2.3.0.1-E4tasg1dFJ86CDrMHWRi4i \
ghc-devel-hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-devel-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4 \
ghc-devel-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua"

inherit rpm
