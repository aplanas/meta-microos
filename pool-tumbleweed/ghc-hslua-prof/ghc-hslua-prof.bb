SUMMARY = "Haskell hslua profiling library"
DESCRIPTION = "This package provides the Haskell hslua profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-prof-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "9e582ff194fdffdcf9c11d7d342816febb5d0e1dced920a9640fa148db7f7e5331f01a1dc19cc2baa192bd7d2294ed9cb10cfb379d77664f7b6fcadb658e2677"

RPROVIDES:${PN} += "ghc-hslua-prof \
ghc-prof-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY"

RDEPENDS:${PN} += "ghc-hslua-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-aeson-2.3.0.1-E4tasg1dFJ86CDrMHWRi4i \
ghc-prof-hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-prof-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4 \
ghc-prof-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
