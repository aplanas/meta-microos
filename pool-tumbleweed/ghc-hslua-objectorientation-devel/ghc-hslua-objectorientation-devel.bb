SUMMARY = "Haskell hslua-objectorientation library development files"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library \
development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "eda563053fc6545c0b21b5528c14d5d635d6f586c6d4c5f6e965c3b05706d7b81b2e3454e65729a04544c236499a3f903ae4e11ff9b90c1d674763d0ea814622"

RPROVIDES:${PN} += "ghc-devel-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-hslua-objectorientation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-objectorientation"

inherit rpm
