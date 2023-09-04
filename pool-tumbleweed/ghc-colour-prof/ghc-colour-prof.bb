SUMMARY = "Haskell colour profiling library"
DESCRIPTION = "This package provides the Haskell colour profiling library."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-prof-2.3.6-2.8.aarch64.rpm"
RPM_HASH = "598ad0fd820e543698584edb790bff5c470c5e8fc01d6646e4ed393571ee09e09d437168cb574aba72b55508f24bf56785ccecac361e82494229e323a4cff483"

RPROVIDES:${PN} += "ghc-colour-prof \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

RDEPENDS:${PN} += "ghc-colour-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
