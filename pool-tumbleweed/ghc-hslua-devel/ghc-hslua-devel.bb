SUMMARY = "Haskell hslua library development files"
DESCRIPTION = "This package provides the Haskell hslua library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "7bb13e08cf7f243a9ee7b6a7d26747ce79cebe3026fad5c9881efc0a15d6a7b0d8e9d50ed41ad942f23e18ac24c489375458bb262c85013056aa252fb27ea917"

RPROVIDES:${PN} += "ghc-devel-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-hslua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-aeson-2.3.0.1-6DckHj1FyFIAboJpo8be6E \
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
