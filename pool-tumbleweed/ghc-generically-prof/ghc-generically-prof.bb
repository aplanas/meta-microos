SUMMARY = "Haskell generically profiling library"
DESCRIPTION = "This package provides the Haskell generically profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-prof-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "86fe6c1811a42d0a0b6f79cfd09f96c3d2a4fca666b8828d0657fc53e11900d0384222253dcae3a42fd2a595b9ad98f507e6da72fbf88832ed2bb01f94bdf0a9"

RPROVIDES:${PN} += "ghc-generically-prof \
ghc-prof-generically-0.1.1-CmULdC2547fBrHCkT48ujn"

RDEPENDS:${PN} += "ghc-generically-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5"

inherit rpm
