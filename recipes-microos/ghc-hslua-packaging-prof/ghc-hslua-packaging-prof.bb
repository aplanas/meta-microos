SUMMARY = "Haskell hslua-packaging profiling library"
DESCRIPTION = "This package provides the Haskell hslua-packaging profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-prof-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "35fd28c591979b8a31dafad790d01674ef6edd766172d1081f4b77b28453f7433689354d4bcf6db2950b8ae31db9696b7c18005b2855d91bd42cfaf16b914d6f"

RPROVIDES:${PN} += "ghc-hslua-packaging-prof \
ghc-hslua-packaging-prof(aarch-64) \
ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4)"
RDEPENDS:${PN} += "ghc-hslua-packaging-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl) \
ghc-prof(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) \
ghc-prof(mtl-2.2.2) \
ghc-prof(text-2.0.2)"

inherit rpm
