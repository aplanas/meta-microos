SUMMARY = "Haskell hslua-objectorientation profiling library"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-prof-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "1b3543fe2de73cc79e21f74434a0abd92025949d130d7007134fe1761311d4dfbbbc60cab85f6c812dc04f4de4bfe8d2aaae2bcc185419dc0a9453ab3763c27f"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-prof \
ghc-prof-hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl"

RDEPENDS:${PN} += "ghc-hslua-objectorientation-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
