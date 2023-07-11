SUMMARY = "Haskell hslua-classes profiling library"
DESCRIPTION = "This package provides the Haskell hslua-classes profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-prof-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "01ce9c638c3e3652e1ee8c41f647a7b549c76fe20043307556fb84278c3e07409e76ef2c461ce027c9546c42a4b2885ee5ab90e24cd8a6a0a8c0d89cd2809150"

RPROVIDES:${PN} += "ghc-hslua-classes-prof \
ghc-prof-hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7"

RDEPENDS:${PN} += "ghc-hslua-classes-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-text-2.0.2"

inherit rpm
