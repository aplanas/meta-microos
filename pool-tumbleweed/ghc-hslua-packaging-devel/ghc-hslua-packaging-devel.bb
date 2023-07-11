SUMMARY = "Haskell hslua-packaging library development files"
DESCRIPTION = "This package provides the Haskell hslua-packaging library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-devel-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "a2d37355904bec888ecb97770a73694974a64d687b700310fc99e50e17bfc164ae3cd355c0112a06ec5e08f6ce316d4698d2c6af6c1c098f441d74464e31fd55"

RPROVIDES:${PN} += "ghc-devel-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4 \
ghc-hslua-packaging-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-devel-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-packaging"

inherit rpm
