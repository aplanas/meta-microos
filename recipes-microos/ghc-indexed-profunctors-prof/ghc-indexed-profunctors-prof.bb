SUMMARY = "Haskell indexed-profunctors profiling library"
DESCRIPTION = "This package provides the Haskell indexed-profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-indexed-profunctors-prof-0.1.1-2.2.aarch64.rpm"
RPM_HASH = "141db387741e99cedbc2f7a690155bb95acdc711c70fc6327aeac766a512756f044e5ab2920ac188877f4ca692f8eb7f64a53ceec58ab84ec261be14d183f301"

RPROVIDES:${PN} += "ghc-indexed-profunctors-prof \
ghc-indexed-profunctors-prof(aarch-64) \
ghc-prof(indexed-profunctors-0.1.1-8slbuH4IUUg1HsCF6rf8GV)"
RDEPENDS:${PN} += "ghc-indexed-profunctors-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
