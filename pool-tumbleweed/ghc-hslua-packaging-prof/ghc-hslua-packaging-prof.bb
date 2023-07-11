SUMMARY = "Haskell hslua-packaging profiling library"
DESCRIPTION = "This package provides the Haskell hslua-packaging profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-prof-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "2c8bd56d4190976334b2a3dc98b093ae48ffad52f7bad2a486cd1f133ea884420167752af6dc84fa546361dbf1664e54b4ab5c75770d3342ec24fa1fece286ed"

RPROVIDES:${PN} += "ghc-hslua-packaging-prof \
ghc-prof-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4"

RDEPENDS:${PN} += "ghc-hslua-packaging-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl \
ghc-prof-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
