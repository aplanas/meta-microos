SUMMARY = "Haskell data-default-instances-dlist profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-prof-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "ad6fefad89c8fe63c7538c2990ac8ba78cca7a3bd00a10fd3632abeeec2fa35a7d7c67a6cd0c08612523d6103b3bb36b3624ce9c2b171529554195f73a42b2f8"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-prof \
ghc-prof-data-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk"

RDEPENDS:${PN} += "ghc-data-default-instances-dlist-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ"

inherit rpm
