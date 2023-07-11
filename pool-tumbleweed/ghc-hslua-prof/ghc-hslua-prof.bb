SUMMARY = "Haskell hslua profiling library"
DESCRIPTION = "This package provides the Haskell hslua profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-prof-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "4dc7ef8e12a9af273b61da808ad3a0b7f7038aadbcb132f0e1ce2305fab5a1da7665d0af67208d94bb8d4c6ca0eb681a1fe39f3dd89d3e40d6e9008d286d356e"

RPROVIDES:${PN} += "ghc-hslua-prof \
ghc-prof-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb"

RDEPENDS:${PN} += "ghc-hslua-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-aeson-2.3.0.1-6DckHj1FyFIAboJpo8be6E \
ghc-prof-hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-prof-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4 \
ghc-prof-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
