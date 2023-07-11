SUMMARY = "Haskell indexed-profunctors profiling library"
DESCRIPTION = "This package provides the Haskell indexed-profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-prof-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "2df658dc1e13180f58f2b0552b19eee05445b911ec3a8f561c895a3b553fb0987fcbadcf3edc4cb02be9be3d9366a5b9913233ec21cb5787e31c1d21e4dbf3b0"

RPROVIDES:${PN} += "ghc-indexed-profunctors-prof \
ghc-prof-indexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka"

RDEPENDS:${PN} += "ghc-indexed-profunctors-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
