SUMMARY = "Haskell these profiling library"
DESCRIPTION = "This package provides the Haskell these profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-prof-1.2-1.7.aarch64.rpm"
RPM_HASH = "257617097109edb90596cdc607c5afcf7b1e4696cd3d1a55bdecd172fb84e3d442f563ba7d52428783facb927fb134302ccb57e200176aafd07700a9f2fa6cf6"

RPROVIDES:${PN} += "ghc-prof-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-these-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-these-devel"

inherit rpm
