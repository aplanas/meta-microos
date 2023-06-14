SUMMARY = "Haskell hslua-objectorientation library development files"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library \
development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-devel-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "2cba839c730aeacb9bc1c241882c29a3259d9c3f9a7d1ea336ff0ea899908227990802947940c736a75fd212af414e36aeb41897afe1c8f986da57b1dd5aef78"

RPROVIDES:${PN} += "ghc-devel-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-hslua-objectorientation-devel"

RDEPENDS:${PN} += "/bin/sh \
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
